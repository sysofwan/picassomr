/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.


Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other
countries.
===============================================================================*/

package com.vuforia.samples.VuforiaSamples.app.PicassoMr;

import java.util.ArrayList;
import java.util.Vector;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Point;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.microsoft.PicassoMR.ProductRating;
import com.microsoft.PicassoMR.ProductReview;
import com.vuforia.CameraDevice;
import com.vuforia.DataSet;
import com.vuforia.ObjectTracker;
import com.vuforia.State;
import com.vuforia.STORAGE_TYPE;
import com.vuforia.Trackable;
import com.vuforia.Tracker;
import com.vuforia.TrackerManager;
import com.vuforia.Vuforia;
import com.vuforia.samples.SampleApplication.SampleApplicationControl;
import com.vuforia.samples.SampleApplication.SampleApplicationException;
import com.vuforia.samples.SampleApplication.SampleApplicationSession;
import com.vuforia.samples.SampleApplication.utils.LoadingDialogHandler;
import com.vuforia.samples.SampleApplication.utils.MyTouch;
import com.vuforia.samples.SampleApplication.utils.SampleApplicationGLView;
import com.vuforia.samples.SampleApplication.utils.Texture;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.ui.SampleAppMenu.SampleAppMenu;
import com.vuforia.samples.VuforiaSamples.ui.SampleAppMenu.SampleAppMenuGroup;
import com.vuforia.samples.VuforiaSamples.ui.SampleAppMenu.SampleAppMenuInterface;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

import microsoft.swagger.codegen.ratingsedgefd.models.MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract;
import microsoft.swagger.codegen.ratingsedgefd.models.MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract;

public class PicassoMainActivity extends Activity implements SampleApplicationControl,
        SampleAppMenuInterface, SensorEventListener
{
    // FOR DEBUGGING ONLY
    // use debug image: http://www.vergium.com/wp-content/uploads/2017/04/vuforia_stones_vergium.jpg
    private boolean debugMode = false;

    private boolean isCompareMode = false;

    private SensorManager mSensorManager;
    Sensor accelerometer;
    Sensor magnetometer;

    private static final String LOGTAG = "PicassoMainActivity";

    SampleApplicationSession vuforiaAppSession;

    private DataSet mCurrentDataset;
    private ArrayList<String> mDatasetStrings = new ArrayList<String>();
    private int mCurrentDatasetSelectionIndex = 0;

    // Our OpenGL view:
    private SampleApplicationGLView mGlView;
    private CanvasOverlayView mCanvasOverlay;

    // Our renderer:
    private PicassoRenderer mRenderer;

    // The textures we will use for rendering:
    private Vector<Texture> mTextures;

    private GestureDetector mGestureDetector;

    private boolean mFlash = false;
    private boolean mExtendedTracking = false;

    private View mFlashOptionView;

    private RelativeLayout mUILayout;

    private SampleAppMenu mSampleAppMenu;

    //LoadingDialogHandler loadingDialogHandler = new LoadingDialogHandler(this);

    // Alert Dialog used to display SDK errors
    private AlertDialog mErrorDialog;

    boolean mIsDroidDevice = false;

    MyTouch mTouch;

    private View customizationSpinner;
    private View radar;
    private View ratingAndReviews;
    private View buyButton;
    private View compareButton;

    private ProgressDialog progressDialog;
    private Handler buyHandler;

    MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract ratingData;

    MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract reviewData;

    // Called when the activity first starts or the user navigates back to an
    // activity.
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d(LOGTAG, "onCreate");
        super.onCreate(savedInstanceState);

        vuforiaAppSession = new SampleApplicationSession(this);

        startLoadingAnimation();

        // FOR DEBUGGING ONLY
        if (debugMode) {
            mDatasetStrings.add("StonesAndChips.xml");
            mDatasetStrings.add("Tarmac.xml");
        }

        vuforiaAppSession
                .initAR(this, ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Load any sample specific textures:
        mTextures = new Vector<Texture>();
        loadTextures();

        mGestureDetector = new GestureDetector(this, new GestureListener());

        mIsDroidDevice = android.os.Build.MODEL.toLowerCase().startsWith(
                "droid");

        // Register the sensor listeners
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        accelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        magnetometer = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

        // Capture our button from layout
        Button button = (Button)findViewById(R.id.compare_button);
        // Register the onClick listener with the implementation above
        button.setOnClickListener(compareButtonListener);

        this.LoadData();

        findViews();

        setupProgressDialog();

        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
                buyHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressDialog.hide();
                        showToast("Thank you for your payment!");
                    }
                }, 3000);
            }
        });


    }

    private void setupProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.isIndeterminate();
        progressDialog.setMessage("Processing your payment...");
        buyHandler = new Handler();
    }

    private void findViews() {
        radar = mUILayout.findViewById(R.id.radar_image_imageView);
        ratingAndReviews = mUILayout.findViewById(R.id.ratings_reviews);
        buyButton = mUILayout.findViewById(R.id.buy_button);
        compareButton = mUILayout.findViewById(R.id.compare_button);
        customizationSpinner = mUILayout.findViewById(R.id.customize_spinner);

    }


    // We want to load specific textures from the APK, which we will later use
    // for rendering.
    private void loadTextures()
    {
        //mTextures.add(Texture.loadTextureFromApk("ObjectRecognition/CubeWireframe.png", getAssets()));
        mTextures.add(Texture.loadTextureFromApk("gray.png", getAssets()));
    }


    // Process Single Tap event to trigger autofocus
    private class GestureListener extends
            GestureDetector.SimpleOnGestureListener
    {
        // Used to set autofocus one second after a manual focus is triggered
        private final Handler autofocusHandler = new Handler();


        @Override
        public boolean onDown(MotionEvent e)
        {
            return true;
        }


        @Override
        public boolean onSingleTapUp(MotionEvent e)
        {
            // Generates a Handler to trigger autofocus
            // after 1 second
            autofocusHandler.postDelayed(new Runnable()
            {
                public void run()
                {
                    boolean result = CameraDevice.getInstance().setFocusMode(
                            CameraDevice.FOCUS_MODE.FOCUS_MODE_TRIGGERAUTO);

                    if (!result)
                        Log.e("SingleTapUp", "Unable to trigger focus");
                }
            }, 1000L);

            return true;
        }
    }


    // Called when the activity will start interacting with the user.
    @Override
    protected void onResume()
    {
        Log.d(LOGTAG, "onResume");
        super.onResume();

        // This is needed for some Droid devices to force portrait
        if (mIsDroidDevice)
        {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

        try
        {
            vuforiaAppSession.resumeAR();
        } catch (SampleApplicationException e)
        {
            Log.e(LOGTAG, e.getString());
        }

        // Resume the GL view:
        if (mGlView != null)
        {
            mGlView.setVisibility(View.VISIBLE);
            mGlView.onResume();
        }


        mSensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_UI);
        mSensorManager.registerListener(this, magnetometer, SensorManager.SENSOR_DELAY_UI);
    }


    // Callback for configuration changes the activity handles itself
    @Override
    public void onConfigurationChanged(Configuration config)
    {
        Log.d(LOGTAG, "onConfigurationChanged");
        super.onConfigurationChanged(config);

        vuforiaAppSession.onConfigurationChanged();
    }


    // Called when the system is about to start resuming a previous activity.
    @Override
    protected void onPause()
    {
        Log.d(LOGTAG, "onPause");
        super.onPause();

        if (mGlView != null)
        {
            mGlView.setVisibility(View.INVISIBLE);
            mGlView.onPause();
        }

        // Turn off the flash
        if (mFlashOptionView != null && mFlash)
        {
            // OnCheckedChangeListener is called upon changing the checked state
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1)
            {
                ((Switch) mFlashOptionView).setChecked(false);
            } else
            {
                ((CheckBox) mFlashOptionView).setChecked(false);
            }
        }

        try
        {
            vuforiaAppSession.pauseAR();
        } catch (SampleApplicationException e)
        {
            Log.e(LOGTAG, e.getString());
        }

        mSensorManager.unregisterListener(this);
    }


    // The final call you receive before your activity is destroyed.
    @Override
    protected void onDestroy()
    {
        Log.d(LOGTAG, "onDestroy");
        super.onDestroy();

        try
        {
            vuforiaAppSession.stopAR();
        } catch (SampleApplicationException e)
        {
            Log.e(LOGTAG, e.getString());
        }

        // Unload texture:
        mTextures.clear();
        mTextures = null;

        System.gc();
    }


    // Initializes AR application components.
    private void initApplicationAR()
    {
        // Create OpenGL ES view:
        int depthSize = 16;
        int stencilSize = 0;
        boolean translucent = Vuforia.requiresAlpha();

        mGlView = new SampleApplicationGLView(this);
        mGlView.init(translucent, depthSize, stencilSize);
        mCanvasOverlay = new CanvasOverlayView(this);

        mRenderer = new PicassoRenderer(this, vuforiaAppSession);
        mRenderer.setTextures(mTextures);
        mGlView.setRenderer(mRenderer);

    }


    private void startLoadingAnimation()
    {
        LayoutInflater inflater = LayoutInflater.from(this);
        mUILayout = (RelativeLayout) inflater.inflate(R.layout.picasso_main_layout,
                null, false);

        mUILayout.setVisibility(View.VISIBLE);
        mUILayout.setBackgroundColor(Color.BLACK);

        /*// Gets a reference to the loading dialog
        loadingDialogHandler.mLoadingDialogContainer = mUILayout
                .findViewById(R.id.loading_indicator);

        // Shows the loading indicator at start
        loadingDialogHandler
                .sendEmptyMessage(LoadingDialogHandler.SHOW_LOADING_DIALOG);*/

        // Adds the inflated layout to the view
        addContentView(mUILayout, new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT));

    }


    // Methods to load and destroy tracking data.
    @Override
    public boolean doLoadTrackersData()
    {
        TrackerManager tManager = TrackerManager.getInstance();
        ObjectTracker objectTracker = (ObjectTracker) tManager
                .getTracker(ObjectTracker.getClassType());
        if (objectTracker == null)
            return false;

        if (mCurrentDataset == null)
            mCurrentDataset = objectTracker.createDataSet();

        if (mCurrentDataset == null)
            return false;

        // FOR DEBUGGING ONLY
        if (debugMode) {
            if (!mCurrentDataset.load(
                    mDatasetStrings.get(mCurrentDatasetSelectionIndex),
                    STORAGE_TYPE.STORAGE_APPRESOURCE))
                return false;
        }
        else {
        if (!mCurrentDataset.load("PicassoDB_OT.xml",
                STORAGE_TYPE.STORAGE_APPRESOURCE))
            return false;
        }

        if (!objectTracker.activateDataSet(mCurrentDataset))
            return false;

        int numTrackables = mCurrentDataset.getNumTrackables();
        for (int count = 0; count < numTrackables; count++)
        {
            Trackable trackable = mCurrentDataset.getTrackable(count);
            if(isExtendedTrackingActive())
            {
                trackable.startExtendedTracking();
            }

            String name = "Current Dataset : " + trackable.getName();
            trackable.setUserData(name);
            Log.d(LOGTAG, "UserData:Set the following user data "
                    + (String) trackable.getUserData());
        }

        return true;
    }


    @Override
    public boolean doUnloadTrackersData()
    {
        // Indicate if the trackers were unloaded correctly
        boolean result = true;

        TrackerManager tManager = TrackerManager.getInstance();
        ObjectTracker objectTracker = (ObjectTracker) tManager
                .getTracker(ObjectTracker.getClassType());
        if (objectTracker == null)
            return false;

        if (mCurrentDataset != null && mCurrentDataset.isActive())
        {
            if (objectTracker.getActiveDataSet(0).equals(mCurrentDataset)
                    && !objectTracker.deactivateDataSet(mCurrentDataset))
            {
                result = false;
            } else if (!objectTracker.destroyDataSet(mCurrentDataset))
            {
                result = false;
            }

            mCurrentDataset = null;
        }

        return result;
    }


    @Override
    public void onInitARDone(SampleApplicationException exception)
    {

        if (exception == null)
        {
            initApplicationAR();

            mRenderer.setActive(true);

            // Now add the GL surface view. It is important
            // that the OpenGL ES surface view gets added
            // BEFORE the camera is started and video
            // background is configured.
            addContentView(mGlView, new LayoutParams(LayoutParams.MATCH_PARENT,
                    LayoutParams.MATCH_PARENT));

            addContentView(mCanvasOverlay, new LayoutParams(LayoutParams.MATCH_PARENT,
                    LayoutParams.MATCH_PARENT));

            // Sets the UILayout to be drawn in front of the camera
            mUILayout.bringToFront();

            // Sets the layout background to transparent
            mUILayout.setBackgroundColor(Color.TRANSPARENT);

            try
            {
                vuforiaAppSession.startAR(CameraDevice.CAMERA_DIRECTION.CAMERA_DIRECTION_DEFAULT);
            } catch (SampleApplicationException e)
            {
                Log.e(LOGTAG, e.getString());
            }

            boolean result = CameraDevice.getInstance().setFocusMode(
                    CameraDevice.FOCUS_MODE.FOCUS_MODE_CONTINUOUSAUTO);

            if (result)
                Log.e(LOGTAG, "Unable to enable continuous autofocus");

            mSampleAppMenu = new SampleAppMenu(this, this, "PicassoMR",
                    mGlView, mUILayout, null);
            setSampleAppMenuSettings();

            mTouch = new MyTouch();

        } else
        {
            Log.e(LOGTAG, exception.getString());
            if(exception.getCode() == SampleApplicationException.LOADING_TRACKERS_FAILURE)
            {
                showInitializationErrorMessage(
                        getString(R.string.INIT_OBJECT_DATASET_NOT_FOUND_TITLE),
                        getString(R.string.INIT_OBJECT_DATASET_NOT_FOUND));

            }
            else
            {
                showInitializationErrorMessage( getString(R.string.INIT_ERROR),
                        exception.getString() );
            }
        }
    }


    // Shows initialization error messages as System dialogs
    public void showInitializationErrorMessage(String title, String message)
    {
        final String errorMessage = message;
        final String messageTitle = title;
        runOnUiThread(new Runnable()
        {
            public void run()
            {
                if (mErrorDialog != null)
                {
                    mErrorDialog.dismiss();
                }

                // Generates an Alert Dialog to show the error message
                AlertDialog.Builder builder = new AlertDialog.Builder(
                        PicassoMainActivity.this);
                builder
                        .setMessage(errorMessage)
                        .setTitle(messageTitle)
                        .setCancelable(false)
                        .setIcon(0)
                        .setPositiveButton(getString(R.string.button_OK),
                                new DialogInterface.OnClickListener()
                                {
                                    public void onClick(DialogInterface dialog, int id)
                                    {
                                        finish();
                                    }
                                });

                mErrorDialog = builder.create();
                mErrorDialog.show();
            }
        });
    }


    public boolean showOverlays = false;

    @Override
    public void onVuforiaUpdate(State state)
    {
        if(state.getNumTrackableResults() > 0 && !isCompareMode)
        {
            mCanvasOverlay.updateTrackable(state.getTrackableResult(0));
            if(showOverlays != true) {
                showOverlays();
            }
        }
        else
        {
            mCanvasOverlay.updateTrackable(null);
            if(showOverlays != false)
            {
                hideOverlays();
            }
        }
    }

    @Override
    public boolean doInitTrackers()
    {
        // Indicate if the trackers were initialized correctly
        boolean result = true;

        TrackerManager tManager = TrackerManager.getInstance();
        Tracker tracker;

        // Trying to initialize the image tracker
        tracker = tManager.initTracker(ObjectTracker.getClassType());
        if (tracker == null)
        {
            Log.e(
                    LOGTAG,
                    "Tracker not initialized. Tracker already initialized or the camera is already started");
            result = false;
        } else
        {
            Log.i(LOGTAG, "Tracker successfully initialized");
        }
        return result;
    }


    @Override
    public boolean doStartTrackers()
    {
        // Indicate if the trackers were started correctly
        boolean result = true;

        Tracker objectTracker = TrackerManager.getInstance().getTracker(
                ObjectTracker.getClassType());
        if (objectTracker != null)
            objectTracker.start();

        return result;
    }


    @Override
    public boolean doStopTrackers()
    {
        // Indicate if the trackers were stopped correctly
        boolean result = true;

        Tracker objectTracker = TrackerManager.getInstance().getTracker(
                ObjectTracker.getClassType());
        if (objectTracker != null)
            objectTracker.stop();

        return result;
    }


    @Override
    public boolean doDeinitTrackers()
    {
        // Indicate if the trackers were deinitialized correctly
        boolean result = true;

        TrackerManager tManager = TrackerManager.getInstance();
        tManager.deinitTracker(ObjectTracker.getClassType());

        return result;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        // Process the Gestures
        if (mSampleAppMenu != null && mSampleAppMenu.processEvent(event))
            return true;

        if (isCompareMode) {
            final int action = event.getAction();
            int maskedAction = (action & MotionEvent.ACTION_MASK);
            if (maskedAction != MotionEvent.ACTION_POINTER_DOWN) {
                float posX = event.getX();
                float posY = event.getY();
                Point size = new Point();
                getWindowManager().getDefaultDisplay().getRealSize(size);
                mTouch.setCenter(size.x / 2, size.y / 2, 0f, 0f);
                mTouch.updateTouchPoint(posX, posY);
                //Log.d(LOGTAG, "My touch center:	\"" + mTouch.getPosX() + "\",\"" + mTouch.getPosY() + "\"");
                //Log.d(LOGTAG, "My touch position:	\"" + posX + "\",\"" + posY + "\"");
                //Log.d(LOGTAG, "My touch rotation:	\"" + mTouch.getRx() + "\",\"" + mTouch.getRy() + "\"");
            }
        }

        return mGestureDetector.onTouchEvent(event);
    }


    boolean isExtendedTrackingActive()
    {
        return mExtendedTracking;
    }

    final public static int CMD_BACK = -1;
    final public static int CMD_EXTENDED_TRACKING = 1;
    final public static int CMD_FLASH = 2;

    // This method sets the menu's settings
    private void setSampleAppMenuSettings()
    {
        SampleAppMenuGroup group;

        //group = mSampleAppMenu.addGroup("", false);
        //group.addTextItem(getString(R.string.menu_back), -1);

        group = mSampleAppMenu.addGroup("", true);
        group.addSelectionItem(getString(R.string.menu_extended_tracking),
                CMD_EXTENDED_TRACKING, false);
        mFlashOptionView = group.addSelectionItem(
                getString(R.string.menu_flash), CMD_FLASH, false);

        mSampleAppMenu.attachMenu();
    }


    @Override
    public boolean menuProcess(int command)
    {

        boolean result = true;

        switch (command)
        {
            case CMD_BACK:
                finish();
                break;

            case CMD_FLASH:
                result = CameraDevice.getInstance().setFlashTorchMode(!mFlash);

                if (result)
                {
                    mFlash = !mFlash;
                } else
                {
                    showToast(getString(mFlash ? R.string.menu_flash_error_off
                            : R.string.menu_flash_error_on));
                    Log.e(LOGTAG,
                            getString(mFlash ? R.string.menu_flash_error_off
                                    : R.string.menu_flash_error_on));
                }
                break;

            case CMD_EXTENDED_TRACKING:
                for (int tIdx = 0; tIdx < mCurrentDataset.getNumTrackables(); tIdx++)
                {
                    Trackable trackable = mCurrentDataset.getTrackable(tIdx);

                    if (!mExtendedTracking)
                    {
                        if (!trackable.startExtendedTracking())
                        {
                            Log.e(LOGTAG,
                                    "Failed to start extended tracking target");
                            result = false;
                        } else
                        {
                            Log.d(LOGTAG,
                                    "Successfully started extended tracking target");
                        }
                    } else
                    {
                        if (!trackable.stopExtendedTracking())
                        {
                            Log.e(LOGTAG,
                                    "Failed to stop extended tracking target");
                            result = false;
                        } else
                        {
                            Log.d(LOGTAG,
                                    "Successfully started extended tracking target");
                        }
                    }
                }

                if (result)
                    mExtendedTracking = !mExtendedTracking;

                break;

        }

        return result;
    }


    private void showToast(String text)
    {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {}

    Float azimut;// View to draw a compass
    float[] mGravity;
    float[] mGeomagnetic;
    public void onSensorChanged(SensorEvent event)
    {
        try {
            if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
                mGravity = event.values;
            }

            if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
                mGeomagnetic = event.values;
            }

            if (mGravity != null && mGeomagnetic != null) {
                float Ri[] = new float[9];
                float I[] = new float[9];
                boolean success = SensorManager.getRotationMatrix(Ri, I, mGravity, mGeomagnetic);
                if (success) {
                    float orientation[] = new float[3];
                    SensorManager.getOrientation(Ri, orientation);
                    azimut = orientation[0]; // orientation contains: azimut, pitch and roll

                    if (this.mUILayout != null) {
                        ImageView imageView = (ImageView) this.mUILayout.findViewById(R.id.radar_image_imageView);
                        imageView.setRotation((-azimut*360/(2*3.14159f)));
                    }
                }
            }
        }
        catch(Exception ex) {
            if (this.mUILayout != null) {
                ImageView imageView = (ImageView) this.mUILayout.findViewById(R.id.radar_image_imageView);
                imageView.setRotation(0);
            }
        }
    }

    private View.OnClickListener compareButtonListener = new View.OnClickListener()
    {
        public void onClick(View v) {

            isCompareMode = true;
            mRenderer.enableRenderObject();

            hideOverlays();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    View comparisonText = mUILayout.findViewById(R.id.comparisonText);

                    comparisonText.setVisibility(View.VISIBLE);
                }
            });
        }
    };

    @Override
    public void onBackPressed() {
        if(isCompareMode)
        {
            isCompareMode = false;
            mRenderer.disableRenderObject();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    View comparisonText = mUILayout.findViewById(R.id.comparisonText);

                    comparisonText.setVisibility(View.INVISIBLE);
                }
            });
        }
    }

    private void hideOverlays()
    {

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                radar.setVisibility(View.INVISIBLE);
                ratingAndReviews.setVisibility(View.INVISIBLE);
                buyButton.setVisibility(View.INVISIBLE);
                compareButton.setVisibility(View.INVISIBLE);
                customizationSpinner.setVisibility(View.INVISIBLE);
                showOverlays = false;
            }
        });
    }

    private void showOverlays()
    {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                radar.setVisibility(View.VISIBLE);
                ratingAndReviews.setVisibility(View.VISIBLE);
                buyButton.setVisibility(View.VISIBLE);
                compareButton.setVisibility(View.VISIBLE);
                customizationSpinner.setVisibility(View.VISIBLE);
                showOverlays = true;
            }
        });
    }

    private void LoadData()
    {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {
                    ratingData = ProductRating.RequestProductRating();
                    reviewData = ProductReview.RequestProductReview();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            PopulateData();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

    }

    private void PopulateData()
    {
        if(reviewData != null)
        {
            ImageView averageRatingImage = (ImageView)mUILayout.findViewById(R.id.averageRatingImage);
            ImageView favorableRatingImage = (ImageView)mUILayout.findViewById(R.id.favorableRatingImage);
            TextView favorableRatingTitle = (TextView)mUILayout.findViewById(R.id.favorableRatingTitle);
            TextView favorableRatingText = (TextView)mUILayout.findViewById(R.id.favorableRatingText);

            ImageView criticalRatingImage = (ImageView)mUILayout.findViewById(R.id.criticalRatingImage);
            TextView criticalRatingTitle = (TextView)mUILayout.findViewById(R.id.criticalRatingTitle);
            TextView criticalRatingText = (TextView)mUILayout.findViewById(R.id.criticalRatingText);

            ImageView criticalRatingImage2 = (ImageView)mUILayout.findViewById(R.id.criticalRatingImage2);
            TextView criticalRatingTitle2 = (TextView)mUILayout.findViewById(R.id.criticalRatingTitle2);
            TextView criticalRatingText2 = (TextView)mUILayout.findViewById(R.id.criticalRatingText2);

            Integer averageRatingInt = ratingData.averageRating().intValue();
            if(averageRatingInt > 5)
            {
                averageRatingInt = 5;
            }

            switch (averageRatingInt){
                case 0:
                    averageRatingImage.setImageResource(R.drawable.star_rating_system_0_stars_t);
                    break;
                case 1:
                    averageRatingImage.setImageResource(R.drawable.star_rating_system_1_star_t);
                    break;
                case 2:
                    averageRatingImage.setImageResource(R.drawable.star_rating_system_2_stars_t);
                    break;
                case 3:
                    averageRatingImage.setImageResource(R.drawable.star_rating_system_3_stars_t);
                    break;
                case 4:
                    averageRatingImage.setImageResource(R.drawable.star_rating_system_4_stars_t);
                    break;
                case 5:
                    averageRatingImage.setImageResource(R.drawable.star_rating_system_5_stars_t);
                    break;
            }


            if(reviewData.items().size() > 0) {

                switch (reviewData.items().get(0).rating()){
                    case 0:
                        favorableRatingImage.setImageResource(R.drawable.star_rating_system_0_stars_t);
                        break;
                    case 1:
                        favorableRatingImage.setImageResource(R.drawable.star_rating_system_1_star_t);
                        break;
                    case 2:
                        favorableRatingImage.setImageResource(R.drawable.star_rating_system_2_stars_t);
                        break;
                    case 3:
                        favorableRatingImage.setImageResource(R.drawable.star_rating_system_3_stars_t);
                        break;
                    case 4:
                        favorableRatingImage.setImageResource(R.drawable.star_rating_system_4_stars_t);
                        break;
                    case 5:
                        favorableRatingImage.setImageResource(R.drawable.star_rating_system_5_stars_t);
                        break;
                }

                favorableRatingTitle.setText(reviewData.items().get(0).title());
                favorableRatingText.setText(reviewData.items().get(0).reviewText());
            }

            if(reviewData.items().size() > 1) {

                switch (reviewData.items().get(1).rating()){
                    case 0:
                        criticalRatingImage.setImageResource(R.drawable.star_rating_system_0_stars_t);
                        break;
                    case 1:
                        criticalRatingImage.setImageResource(R.drawable.star_rating_system_1_star_t);
                        break;
                    case 2:
                        criticalRatingImage.setImageResource(R.drawable.star_rating_system_2_stars_t);
                        break;
                    case 3:
                        criticalRatingImage.setImageResource(R.drawable.star_rating_system_3_stars_t);
                        break;
                    case 4:
                        criticalRatingImage.setImageResource(R.drawable.star_rating_system_4_stars_t);
                        break;
                    case 5:
                        criticalRatingImage.setImageResource(R.drawable.star_rating_system_5_stars_t);
                        break;
                }

                criticalRatingTitle.setText(reviewData.items().get(1).title());
                criticalRatingText.setText(reviewData.items().get(1).reviewText());
            }

            if(reviewData.items().size() > 2) {

                switch (reviewData.items().get(2).rating()){
                    case 0:
                        criticalRatingImage2.setImageResource(R.drawable.star_rating_system_0_stars_t);
                        break;
                    case 1:
                        criticalRatingImage2.setImageResource(R.drawable.star_rating_system_1_star_t);
                        break;
                    case 2:
                        criticalRatingImage2.setImageResource(R.drawable.star_rating_system_2_stars_t);
                        break;
                    case 3:
                        criticalRatingImage2.setImageResource(R.drawable.star_rating_system_3_stars_t);
                        break;
                    case 4:
                        criticalRatingImage2.setImageResource(R.drawable.star_rating_system_4_stars_t);
                        break;
                    case 5:
                        criticalRatingImage2.setImageResource(R.drawable.star_rating_system_5_stars_t);
                        break;
                }

                criticalRatingTitle2.setText(reviewData.items().get(2).title());
                criticalRatingText2.setText(reviewData.items().get(2).reviewText());
            }
        }
    }

}