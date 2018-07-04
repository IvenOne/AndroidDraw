package htfy.com.klineproject.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class ArcView extends View {

    Paint p = new Paint();
    Paint linePaint = new Paint();
    public ArcView(Context context) {
        super(context);

    }

    public ArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        p.setAntiAlias(true);
        linePaint.setAntiAlias(true);
        linePaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(100,100,400,320,-150,140,true,p);
        canvas.drawArc(100,100,400,320,40,100,false,p);
        canvas.drawArc(100,100,400,320,150,50,false,linePaint);
        super.onDraw(canvas);
    }
}
