package com.example.myapplication;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class Overlay extends View {

    private Paint paint = new Paint();
    Canvas mcanvas;
    public Overlay(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mcanvas = canvas;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5);
        int x0 = mcanvas.getWidth()/2;
        int y0 = mcanvas.getHeight()/2;
        //mcanvas.drawCircle(x0, y0, 45, paint);

        paint.setColor(Color.TRANSPARENT);
        mcanvas.drawRect(x0 - 960, y0 - 540, x0+960, y0+540, paint);

    }


}

