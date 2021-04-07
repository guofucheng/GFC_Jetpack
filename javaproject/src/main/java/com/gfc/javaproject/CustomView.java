package com.gfc.javaproject;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

/**
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/4/6 9:37
 * @UpdateUser:
 *
 * 当一个事件产生后，最先传递给（）
 *
 *
 *
 *
 * @UpdateDate: 2021/4/6 9:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CustomView extends View {


    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    int posX,posY;
    private static final String TAG = "View";
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"onTouchEvent"+event.getAction());

        int x= (int) event.getX();
        int y= (int) event.getY();


        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            posX=x;
            posY=y;

        }else if (event.getAction()==MotionEvent.ACTION_MOVE){
            //移动的距离

            int offsetX=x-posX;
            int offsetY=y-posY;
//            layout(getLeft()+offsetX,getTop()+offsetY,getRight()+offsetX,getBottom()+offsetY);//方式1

            offsetLeftAndRight(offsetX);//方式2
            offsetTopAndBottom(offsetY);

//            ConstraintLayout.LayoutParams layoutParams= (ConstraintLayout.LayoutParams) getLayoutParams();
//            layoutParams.topMargin=getTop()+offsetY;
//            layoutParams.leftMargin=getLeft()+offsetX;
//            setLayoutParams(layoutParams);

        }else if (event.getAction() == MotionEvent.ACTION_UP){

        }


        return true;
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG,"dispatchTouchEvent"+event.getAction());
        return super.dispatchTouchEvent(event);
    }
}
