package com.vuforia.samples.VuforiaSamples.app.PicassoMr;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;

/**
 * Created by sysofwan on 7/25/17.
 */

public class TooltipsDrawer {

    private Paint arrowPaint = new Paint();

    private Paint titleFontPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private Paint descriptionFontPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private Rect textRect = new Rect();

    public TooltipsDrawer() {
        arrowPaint.setColor(Color.GREEN);
        arrowPaint.setStrokeWidth(13f);

        titleFontPaint.setColor(Color.GREEN);
        titleFontPaint.setTextSize(70f);

        descriptionFontPaint.setColor(Color.GREEN);
        descriptionFontPaint.setTextSize(50f);
        descriptionFontPaint.setTextAlign(Paint.Align.LEFT);
    }

    public void draw(Canvas canvas, PointF start, PointF end, String title, String description) {
        canvas.drawLine(start.x, start.y, end.x, end.y, arrowPaint);

        float textX = end.x - 25;
        float textY = end.y + 75;
        canvas.drawText(title, textX, textY, titleFontPaint);
        if (description != null) {
            titleFontPaint.getTextBounds(title, 0, title.length(), textRect);

            float titleBottom = textY + textRect.bottom;
            titleFontPaint.getTextBounds(description, 0, title.length(), textRect);
            canvas.drawText(description, textX, titleBottom + textRect.bottom + 30, descriptionFontPaint);
        }
    }

}
