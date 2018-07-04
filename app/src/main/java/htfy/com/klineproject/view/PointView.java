package htfy.com.klineproject.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class PointView extends View {
    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint p = new Paint();
        p.setAntiAlias(true);
        p.setColor(Color.RED);
        p.setStrokeWidth(100);
        p.setStrokeCap(Paint.Cap.ROUND);


        Paint pSqu = new Paint();
        pSqu.setAntiAlias(true);
        pSqu.setColor(Color.BLUE);
        pSqu.setStrokeWidth(100);
        pSqu.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(200,200,p);
        canvas.drawPoint(400,200,pSqu);
        super.onDraw(canvas);
    }
}
