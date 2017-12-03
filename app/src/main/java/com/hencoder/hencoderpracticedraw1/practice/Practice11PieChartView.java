package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private RectF rectF = new RectF(200, 200, 600, 600);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, 0, -70, true, paint);
        paint.setColor(Color.RED);
        canvas.drawArc(180, 180, 580, 580, 180, 110, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 77, 100, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 75, -50, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 25, -15, true, paint);
        paint.setColor(Color.CYAN);
        canvas.drawArc(rectF, 14, -14, true, paint);
    }
}
