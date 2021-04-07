package com.gfc.javaproject;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

/**
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/4/7 15:44
 * @UpdateUser:
 * @UpdateDate: 2021/4/7 15:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyViewGroup1 extends LinearLayout {
    private static final String TAG = "MyViewGroup1";
    public MyViewGroup1(Context context) {
        super(context);
    }

    public MyViewGroup1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,"dispatchTouchEvent"+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,"onInterceptTouchEvent"+ev.getAction());
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"onTouchEvent"+event.getAction());
        return super.onTouchEvent(event);
    }
}
