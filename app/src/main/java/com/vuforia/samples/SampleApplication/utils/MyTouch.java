package com.vuforia.samples.SampleApplication.utils;

/**
 * Created by antho on 7/25/2017.
 */

public class MyTouch {
    private float rx;
    private float ry;
    private float rz;

    private float xPos;
    private float yPos;
    private float zPos;

    private float thredshold = 10f;
    private float stepIncrease = 1f;

    public void setCenter(float xPos, float yPos, float zPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    public void reset()
    {
        this.rx = 0;
        this.ry = 0;
        this.rz = 0;
    }

    public void updateTouchPoint(float xPos, float yPos, float zPos)
    {
        if (xPos > this.xPos + thredshold)
        {
            rx += stepIncrease;
        }
        if (yPos > this.yPos + thredshold)
        {
            ry += stepIncrease;
        }
        if (zPos > this.zPos + thredshold)
        {
            rz += stepIncrease;
        }
        if (rx > 360)
        {
            rx -= 360;
        }
        if (ry > 360)
        {
            ry -= 360;
        }
        if (rz > 360)
        {
            rz -= 360;
        }
        if (rx < -360)
        {
            rx += 360;
        }
        if (ry < -360)
        {
            ry += 360;
        }
        if (rz < -360)
        {
            rz += 360;
        }
    }

    public float getRx()
    {
        return this.rx;
    }

    public float getRy()
    {
        return this.ry;
    }

    public float getRZ()
    {
        return this.rz;
    }
}
