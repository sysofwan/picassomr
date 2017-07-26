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

    private float xSize;
    private float ySize;

    private float thredshold = 10f;
    private float stepIncrease = 1f;

    public void setCenter(float xPos, float yPos, float width, float height)
    {
        this.xPos = xPos - (2 * width); // position of the virtual obj
        this.yPos = yPos;
        this.xSize = width;
        this.ySize = height;
    }

    public void reset()
    {
        this.rx = 0;
        this.ry = 0;
        this.rz = 0;
    }

    public void updateTouchPoint(float xPos, float yPos)
    {
        if (xPos > (this.xPos + thredshold))
        {
            rx += stepIncrease;
        }
        else if (xPos < (this.xPos - thredshold)) {
            rx -= stepIncrease;
        }

        if (yPos > (this.yPos + thredshold))
        {
            ry += stepIncrease;
        }
        else if (yPos < (this.yPos - thredshold))
        {
            ry -= stepIncrease;
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

    public float getPosX()
    {
        return this.xPos;
    }

    public float getPosY()
    {
        return this.yPos;
    }
}
