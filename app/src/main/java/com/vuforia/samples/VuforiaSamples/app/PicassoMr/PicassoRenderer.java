/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other
countries.
===============================================================================*/

package com.vuforia.samples.VuforiaSamples.app.PicassoMr;

import java.util.Vector;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.res.Configuration;
import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;

import com.vuforia.CameraCalibration;
import com.vuforia.CameraDevice;
import com.vuforia.Device;
import com.vuforia.Matrix44F;
import com.vuforia.ObjectTarget;
import com.vuforia.ObjectTargetResult;
import com.vuforia.Renderer;
import com.vuforia.State;
import com.vuforia.Tool;
import com.vuforia.Trackable;
import com.vuforia.TrackableResult;
import com.vuforia.Vec2F;
import com.vuforia.Vec3F;
import com.vuforia.VideoBackgroundConfig;
import com.vuforia.VideoMode;
import com.vuforia.Vuforia;
import com.vuforia.samples.SampleApplication.SampleAppRenderer;
import com.vuforia.samples.SampleApplication.SampleAppRendererControl;
import com.vuforia.samples.SampleApplication.SampleApplicationSession;
import com.vuforia.samples.SampleApplication.utils.CubeObject;
import com.vuforia.samples.SampleApplication.utils.CubeShaders;
import com.vuforia.samples.SampleApplication.utils.MyMath;
import com.vuforia.samples.SampleApplication.utils.ObjLoader;
import com.vuforia.samples.SampleApplication.utils.LoadingDialogHandler;
import com.vuforia.samples.SampleApplication.utils.SampleUtils;
import com.vuforia.samples.SampleApplication.utils.Texture;


// The renderer class for the ImageTargets sample.
public class PicassoRenderer implements GLSurfaceView.Renderer, SampleAppRendererControl
{
    private boolean renderObject = false;

    private static final String LOGTAG = "ObjectTargetRenderer";

    private SampleApplicationSession vuforiaAppSession;
    private PicassoMainActivity mActivity;
    private SampleAppRenderer mSampleAppRenderer;

    private Vector<Texture> mTextures;
    private int shaderProgramID;
    private int vertexHandle;
    private int textureCoordHandle;
    private int normalsHandle;

    private int texSampler2DHandle;
    private int mvpMatrixHandle;
    private int inverseMvMatrixHandle;
    private int opacityHandle;
    private int colorHandle;
    private int shineDamperHandle;
    private int reflectivityHandle;

    private int transformationMatrixHandle;
    private int lightPositionVectorHandle;
    private int lightColorVectorHandle;

    private CubeObject mCubeObject;

    private Renderer mRenderer;

    private boolean mIsActive = false;


    public PicassoRenderer(PicassoMainActivity activity,
                                SampleApplicationSession session)
    {
        mActivity = activity;
        vuforiaAppSession = session;

        // SampleAppRenderer used to encapsulate the use of RenderingPrimitives setting
        // the device mode AR/VR and stereo mode
        mSampleAppRenderer = new SampleAppRenderer(this, mActivity, Device.MODE.MODE_AR, false, 10f, 5000f);
    }


    // Called to draw the current frame.
    @Override
    public void onDrawFrame(GL10 gl)
    {
        if (!mIsActive)
            return;

        // Call our function to render content from SampleAppRenderer class
        mSampleAppRenderer.render();
    }


    // Called when the surface is created or recreated.
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config)
    {
        Log.d(LOGTAG, "GLRenderer.onSurfaceCreated");

        // Call Vuforia function to (re)initialize rendering after first use
        // or after OpenGL ES context was lost (e.g. after onPause/onResume):
        vuforiaAppSession.onSurfaceCreated();

        mSampleAppRenderer.onSurfaceCreated();
    }


    // Called when the surface changed size.
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height)
    {
        Log.d(LOGTAG, "GLRenderer.onSurfaceChanged");

        // Call Vuforia function to handle render surface size changes:
        vuforiaAppSession.onSurfaceChanged(width, height);

        // RenderingPrimitives to be updated when some rendering change is done
        mSampleAppRenderer.onConfigurationChanged(mIsActive);

        // Init rendering
        initRendering();
    }


    public void setActive(boolean active)
    {
        mIsActive = active;

        if(mIsActive)
            mSampleAppRenderer.configureVideoBackground();
    }


    // Function for initializing the renderer.
    private void initRendering()
    {
        //mCubeObject = new CubeObject();
        mCubeObject = ObjLoader.loadCubeObjModel("MacBook Air", mActivity.getAssets());

        mRenderer = Renderer.getInstance();

        // Now generate the OpenGL texture objects and add settings
        for (Texture t : mTextures)
        {
            GLES20.glGenTextures(1, t.mTextureID, 0);
            GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, t.mTextureID[0]);
            GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D,
                    GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR);
            GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D,
                    GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
            GLES20.glTexImage2D(GLES20.GL_TEXTURE_2D, 0, GLES20.GL_RGBA,
                    t.mWidth, t.mHeight, 0, GLES20.GL_RGBA,
                    GLES20.GL_UNSIGNED_BYTE, t.mData);
        }
        SampleUtils.checkGLError("ObjectTarget GLInitRendering");

        GLES20.glClearColor(0.0f, 0.0f, 0.0f, Vuforia.requiresAlpha() ? 0.0f
                : 1.0f);

        shaderProgramID = SampleUtils.createProgramFromShaderSrc(
                CubeShaders.CUBE_MESH_VERTEX_SHADER,
                CubeShaders.CUBE_MESH_FRAGMENT_SHADER);

        vertexHandle = GLES20.glGetAttribLocation(shaderProgramID,
                "vertexPosition");
        textureCoordHandle = GLES20.glGetAttribLocation(shaderProgramID,
                "vertexTexCoord");
        normalsHandle = GLES20.glGetAttribLocation(shaderProgramID,
                "vertexNormals");

        texSampler2DHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "texSampler2D");
        mvpMatrixHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "modelViewProjectionMatrix");
        inverseMvMatrixHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "inverseModelViewMatrix");
        opacityHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "opacity");
        colorHandle = GLES20.glGetUniformLocation(shaderProgramID, "color");

        transformationMatrixHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "transformationMatrix");
        texSampler2DHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "texSampler2D");
        lightPositionVectorHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "lightPosition");
        lightColorVectorHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "lightColor");
        shineDamperHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "shineDamper");
        reflectivityHandle = GLES20.glGetUniformLocation(shaderProgramID,
                "reflectivity");

        // Hide the Loading Dialog
        /*// Hide the Loading Dialog
        mActivity.loadingDialogHandler
                .sendEmptyMessage(LoadingDialogHandler.HIDE_LOADING_DIALOG);*/

    }

    public void enableRenderObject()
    {
        renderObject = true;
    }

    public void disableRenderObject()
    {
        renderObject = false;
    }

    // The render function called from SampleAppRendering by using RenderingPrimitives views.
    // The state is owned by SampleAppRenderer which is controlling it's lifecycle.
    // State should not be cached outside this method.
    public void renderFrame(State state, float[] projectionMatrix)
    {
        // Renders video background replacing Renderer.DrawVideoBackground()
        mSampleAppRenderer.renderVideoBackground();

        GLES20.glEnable(GLES20.GL_DEPTH_TEST);

        GLES20.glEnable(GLES20.GL_CULL_FACE);
        GLES20.glEnable(GLES20.GL_BLEND);
        GLES20.glBlendFunc(GLES20.GL_SRC_ALPHA, GLES20.GL_ONE_MINUS_SRC_ALPHA);

        float[] lightPosition = new Vec3F(500, 1000, 1000).getData();
        float[] lightColor = new Vec3F(0.01f,0.01f,0.01f).getData();
        float shineDamper = 1f;
        float reflectivity = 1f;

        if (state.getNumTrackableResults() == 0)
        {
            mActivity.mTouch.reset();
        }

        // did we find any trackables this frame?
        for (int tIdx = 0; tIdx < state.getNumTrackableResults(); tIdx++)
        {
            TrackableResult result = state.getTrackableResult(tIdx);
            Trackable trackable = result.getTrackable();
            //printUserData(trackable);

            if (!result.isOfType(ObjectTargetResult.getClassType())) {
                continue;
            }

            float[] centerPoint = this.getScreenCoor(result).getData();

            ObjectTarget objectTarget = (ObjectTarget) trackable;

            Matrix44F modelViewMatrix_Vuforia = Tool
                    .convertPose2GLMatrix(result.getPose());
            float[] modelViewMatrix = modelViewMatrix_Vuforia.getData();

            // deal with the modelview and projection matrices
            float[] modelViewProjection = new float[16];

            float[] objectSize = objectTarget.getSize().getData();

            //mActivity.mTouch.setCenter(centerPoint[0], centerPoint[1], objectSize[0], objectSize[1]);

            //float[] transformationData = MyMath.createTransformationMatrix(new Vec3F(0f, 0f, 0f), 0f, 0f, 0f, 1);

            float[] inverseModelViewMatrix = MyMath.invert(modelViewMatrix);
            float[] transformationMatrix = MyMath.getIdentity();

            transformationMatrix = MyMath.fixingLaptopPosition(transformationMatrix);
            transformationMatrix = MyMath.moveHorizontalPosition(transformationMatrix, objectSize[0]*2*-1);
            transformationMatrix = MyMath.rotateObject(transformationMatrix, mActivity.mTouch.getRx(), mActivity.mTouch.getRy());

            modelViewMatrix = MyMath.fixingLaptopPosition(modelViewMatrix);
            modelViewMatrix = MyMath.moveHorizontalPosition(modelViewMatrix, objectSize[0]*2*-1);
            modelViewMatrix = MyMath.rotateObject(modelViewMatrix, mActivity.mTouch.getRx(), mActivity.mTouch.getRy());

            Matrix.multiplyMM(modelViewProjection, 0, projectionMatrix, 0, modelViewMatrix, 0);

            // activatrigidBodyTarget.xmle the shader program and bind the vertex/normal/tex coords
            GLES20.glUseProgram(shaderProgramID);

            GLES20.glVertexAttribPointer(vertexHandle, 3, GLES20.GL_FLOAT,
                    false, 0, mCubeObject.getVertices());
            GLES20.glUniform1f(opacityHandle, 0.3f);
            GLES20.glUniform3f(colorHandle, 0.0f, 0.0f, 0.0f);
            GLES20.glVertexAttribPointer(textureCoordHandle, 2,
                    GLES20.GL_FLOAT, false, 0, mCubeObject.getTexCoords());

            GLES20.glVertexAttribPointer(normalsHandle, 3, GLES20.GL_FLOAT,
                    false, 0, mCubeObject.getNormals());

            GLES20.glEnableVertexAttribArray(vertexHandle);
            GLES20.glEnableVertexAttribArray(textureCoordHandle);
            GLES20.glEnableVertexAttribArray(normalsHandle);

            GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
            GLES20.glBindTexture(GLES20.GL_TEXTURE_2D,
                    mTextures.get(0).mTextureID[0]);
            GLES20.glUniformMatrix4fv(mvpMatrixHandle, 1, false,
                    modelViewProjection, 0);
            GLES20.glUniform1i(texSampler2DHandle, 0);

            GLES20.glUniform3fv(lightPositionVectorHandle, 1, lightPosition, 0);
            GLES20.glUniform3fv(lightColorVectorHandle, 1, lightColor, 0);
            GLES20.glUniform1f(shineDamperHandle, shineDamper);
            GLES20.glUniform1f(reflectivityHandle, reflectivity);

            // pass the model view matrix to the shader
            GLES20.glUniformMatrix4fv(mvpMatrixHandle, 1, false,
                    modelViewProjection, 0);
            GLES20.glUniformMatrix4fv(inverseMvMatrixHandle, 1, false,
                    inverseModelViewMatrix, 0);
            GLES20.glUniformMatrix4fv(transformationMatrixHandle, 1, false,
                    transformationMatrix, 0);

            if(renderObject == true)
            {
                GLES20.glDrawElements(GLES20.GL_TRIANGLES,
                    mCubeObject.getNumObjectIndex(), GLES20.GL_UNSIGNED_SHORT,
                    mCubeObject.getIndices());
            }

            // disable the enabled arrays
            GLES20.glDisableVertexAttribArray(vertexHandle);
            GLES20.glDisableVertexAttribArray(textureCoordHandle);

            SampleUtils.checkGLError("Render Frame");

        }

        GLES20.glDisable(GLES20.GL_DEPTH_TEST);
        GLES20.glDisable(GLES20.GL_BLEND);

        mRenderer.end();
    }


    private void printUserData(Trackable trackable)
    {
        String userData = (String) trackable.getUserData();
        Log.d(LOGTAG, "UserData:Retreived User Data	\"" + userData + "\"");
    }


    public void setTextures(Vector<Texture> textures)
    {
        mTextures = textures;

    }

    private Vec2F getScreenCoor(TrackableResult result) {
        CameraCalibration cameraCalibaration = CameraDevice.getInstance().getCameraCalibration();

        Vec2F cameraPoint = Tool.projectPoint(cameraCalibaration, result.getPose(), new Vec3F(0, 0, 0));

        return cameraToScreenPoint(cameraPoint);
    }

    private Vec2F cameraToScreenPoint(Vec2F cameraPoint) {
        VideoMode videoMode = CameraDevice.getInstance().getVideoMode(CameraDevice.MODE.MODE_DEFAULT);
        VideoBackgroundConfig backgroundConfig = Renderer.getInstance().getVideoBackgroundConfig();

        Point size = new Point();
        mActivity.getWindowManager().getDefaultDisplay().getRealSize(size);

        int xOffset = (size.x - backgroundConfig.getSize().getData()[0])/2 + backgroundConfig.getPosition().getData()[0];
        int yOffset = (size.y - backgroundConfig.getSize().getData()[1])/2 - backgroundConfig.getPosition().getData()[1];

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



}
