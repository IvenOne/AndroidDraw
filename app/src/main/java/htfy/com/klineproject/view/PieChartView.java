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

import java.util.Random;

public class PieChartView extends View {
    public PieChartView(Context context) {
        super(context);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {

        Paint rp = new Paint(Paint.ANTI_ALIAS_FLAG);
        rp.setColor(Color.RED);

        Paint bp = new Paint(Paint.ANTI_ALIAS_FLAG);
        bp.setColor(Color.BLUE);

        Paint yp = new Paint(Paint.ANTI_ALIAS_FLAG);
        yp.setColor(Color.YELLOW);

        Paint hp = new Paint(Paint.ANTI_ALIAS_FLAG);
        hp.setColor(Color.BLACK);
        canvas.drawArc(100,100,300,300,-179,100,true,rp);
        canvas.drawArc(108,108,310,310,-60,60,true,bp);
        canvas.drawArc(108,108,310,310,18,80,true,yp);
        canvas.drawArc(108,108,310,310,99,78,true,hp);

        super.onDraw(canvas);
    }
}
