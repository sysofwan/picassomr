package com.vuforia.samples.VuforiaSamples.app.PicassoMr;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Choreographer;
import android.view.SurfaceView;

import com.vuforia.CameraCalibration;
import com.vuforia.CameraDevice;
import com.vuforia.Renderer;
import com.vuforia.State;
import com.vuforia.Tool;
import com.vuforia.TrackableResult;
import com.vuforia.TrackerManager;
import com.vuforia.Vec2F;
import com.vuforia.Vec3F;
import com.vuforia.VideoBackgroundConfig;
import com.vuforia.VideoMode;
import com.vuforia.samples.SampleApplication.SampleAppRenderer;

/**
 * Created by sysofwan on 7/24/17.
 */

public class CanvasOverlayView extends SurfaceView implements Choreographer.FrameCallback {

    private Activity mActivity;

    private Paint paint;

    private TrackableResult trackableResult = null;

    private static final String TAG = "CanvasOverlayView";

    private TooltipsDrawer tooltipsDrawer = new TooltipsDrawer();

    public CanvasOverlayView(Activity activity) {
        super(activity);
        mActivity = activity;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
        paint.setTextSize(45);
        setWillNotDraw(false);
        Choreographer.getInstance().postFrameCallback(this);
    }

    public void updateTrackable(TrackableResult result) {
        trackableResult = result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
        TrackableResult result = trackableResult;
        if (result != null) {
            //Log.d(TAG, "drawing canvas");
            Vec2F coor = getScreenCoor(result);
            draw(canvas, coor.getData()[0], coor.getData()[1]);
        }
    }

    private void draw(Canvas canvas, float cX, float cY) {
        tooltipsDrawer.draw(canvas,
                new PointF(cX - 30, cY - 100), new PointF(cX + 200, cY - 200), "12.3-inch Pixel Sense display", "10 point multi-touch");

        tooltipsDrawer.draw(canvas,
                new PointF(cX - 35, cY + 300), new PointF(cX + 200, cY + 400), "Type Cover", "Alcantara fabric");
    }



    private Vec2F getScreenCoor(TrackableResult result) {
        CameraCalibration cameraCalibaration = CameraDevice.getInstance().getCameraCalibration();

        Vec2F cameraPoint = Tool.projectPoint(cameraCalibaration, result.getPose(), new Vec3F(0, 0, 0));

        return cameraToScreenPoint(cameraPoint);
    }

    private Vec2F cameraToScreenPoint(Vec2F cameraPoint) {
        VideoMode videoMode = CameraDevice.getInstance().getVideoMode(CameraDevice.MODE.MODE_DEFAULT);
        VideoBackgroundConfig backgroundConfig = Renderer.getInstance().getVideoBackgroundConfig();

        int xOffset = (getWidth() - backgroundConfig.getSize().getData()[0])/2 + backgroundConfig.getPosition().getData()[0];
        int yOffset = (getHeight() - backgroundConfig.getSize().getData()[1])/2 - backgroundConfig.getPosition().getData()[1];

        Configuration config = mActivity.getResources().getConfiguration();
        if (config.orientation == Configuration.ORIENTATION_PORTRAIT) {
            int rotatedX = videoMode.getHeight() - (int)cameraPoint.getData()[1];
            int rotatedY = (int)cameraPoint.getData()[0];

            return new Vec2F(rotatedX * backgroundConfig.getSize().getData()[0] / (float) videoMode.getHeight() + xOffset,
                    rotatedY * backgroundConfig.getSize().getData()[1] / (float) videoMode.getWidth() + yOffset);
        }

        return new Vec2F(cameraPoint.getData()[0] * backgroundConfig.getSize().getData()[0] / (float) videoMode.getWidth() + xOffset,
                cameraPoint.getData()[1] * backgroundConfig.getSize().getData()[1] / (float) videoMode.getHeight() + yOffset);
    }


    @Override
    public void doFrame(long frameTimeNanos) {
        invalidate();
        Choreographer.getInstance().postFrameCallback(this);
    }
}
