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

    private Paint.FontMetrics fontMetrics = new Paint.FontMetrics();

    public TooltipsDrawer() {
        arrowPaint.setColor(Color.GREEN);
        arrowPaint.setStrokeWidth(10f);

        titleFontPaint.setColor(Color.GREEN);
        titleFontPaint.setTextSize(70f);

        descriptionFontPaint.setColor(Color.GREEN);
        descriptionFontPaint.setTextSize(50f);
        descriptionFontPaint.setTextAlign(Paint.Align.LEFT);
    }

    public void draw(Canvas canvas, PointF start, PointF end, String title, String description) {
        canvas.drawLine(start.x, start.y, end.x, end.y, arrowPaint);

        float textX = end.x + 20;
        float textY = end.y + 15;
        canvas.drawText(title, textX, textY, titleFontPaint);
        if (description != null) {
            titleFontPaint.getFontMetrics(fontMetrics);

            float titleBottom = textY + fontMetrics.descent;
            canvas.drawText(description, textX, titleBottom + fontMetrics.bottom + 20, descriptionFontPaint);
        }
    }

}
