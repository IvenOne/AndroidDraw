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

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

public class CircleView extends View {
    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint(ANTI_ALIAS_FLAG);
        Paint pl = new Paint(ANTI_ALIAS_FLAG);
        Paint pc = new Paint(ANTI_ALIAS_FLAG);
        Paint pt = new Paint(ANTI_ALIAS_FLAG);
        pl.setStyle(Paint.Style.STROKE);
        pc.setColor(Color.BLUE);
        pt.setStyle(Paint.Style.STROKE);
        pt.setStrokeWidth(10);
        float startX = ViewUtil.getWidth(this.getContext())/4;
        float startY = ViewUtil.getHeight(this.getContext())/4;
        canvas.drawCircle(startX,40,30,p);
        canvas.drawCircle(startX*2,40,30,pl);
        canvas.drawCircle(startX,40*3,30,pc);
        canvas.drawCircle(startX*2,40*3,30,pt);
    }
}
