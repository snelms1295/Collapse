package com.example.snelms.collapse.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.snelms.collapse.Collapse;

/**
 * Created by snelms on 3/19/15.
 */
public class PieceView extends TextView {
    public PieceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int parentWidth = MeasureSpec.getSize(widthMeasureSpec);
        int diameter = (int) (parentWidth * 0.33);
//        super.onMeasure(MeasureSpec.makeMeasureSpec(diameter, MeasureSpec.EXACTLY), diameter);
        setMeasuredDimension(diameter, diameter);
    }

}
