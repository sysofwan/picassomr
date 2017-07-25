package com.vuforia.samples.SampleApplication.utils;

/**
 * Created by antho on 7/24/2017.
 */

import android.opengl.Matrix;

import com.vuforia.Vec3F;
import com.vuforia.Vec4F;
import com.vuforia.Matrix34F;

public class MyMath {
    public static float[] createTransformationMatrix(Vec3F translation, float rx, float ry,
                                                      float rz, float scale) {
        float[] matrixData = new float[4*4];
        Matrix.setIdentityM(matrixData,0);
        float[] translationXyz = translation.getData();
        Matrix.translateM(matrixData, 0, translationXyz[0], translationXyz[1], translationXyz[2]);
        Matrix.rotateM(matrixData, 0, rx, 1, 0, 0);
        Matrix.rotateM(matrixData, 0, ry, 0, 1, 0);
        Matrix.rotateM(matrixData, 0, rz, 0, 0, 1);
        Matrix.scaleM(matrixData, 0, scale, scale, scale);
        return matrixData;
    }

    public static float[] fixingLaptopPosition(float[] modelMatrix)
    {
        Matrix.rotateM(modelMatrix, 0, 180, 0, 1, 0);
        Matrix.rotateM(modelMatrix, 0, -90, 1, 0, 0);
        Matrix.translateM(modelMatrix, 0, 0, 0, -80);
        Matrix.translateM(modelMatrix, 0, 0, -150, 0);
        return modelMatrix;
    }

    public static float[] moveHorizontalPosition(float[] modelMatrix, float xPos)
    {
        Matrix.translateM(modelMatrix, 0, xPos, 0, 0);
        return modelMatrix;
    }

    public static float[] invert(float[] viewMatrix)
    {
        float[] invViewMatrix = new float[4*4];
        Matrix.invertM(viewMatrix, 0, invViewMatrix, 0);
        return invViewMatrix;
    }
}
