package com.gfc.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("MainActivity","dispatchTouchEvent"+ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("MainActivity","onTouchEvent"+event.getAction());
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activity>MyViewGroup1>MyViewGroup2>View
        /*

        MainActivity        dispatchTouchEvent
        MyViewGroup1        dispatchTouchEvent0     onInterceptTouchEvent0
        MyViewGroup2        dispatchTouchEvent0     onInterceptTouchEvent0
        View                dispatchTouchEvent0     onTouchEvent0
         */

//        MyViewGroup1 myViewGroup1=findViewById(R.id.myViewGroup1);
//        myViewGroup1.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e("MyViewGroup1","onTouch"+event.getAction());
//                return true;
//            }
//        });
//        MyViewGroup2 myViewGroup2=findViewById(R.id.myViewGroup2);
//        myViewGroup2.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e("MyViewGroup2","onTouch"+event.getAction());
//                return true;
//            }
//        });

//        CustomView customView=findViewById(R.id.cst);
        //这两个方法都是在dispatchTouchEvent中执行的，onTouch优先级高于onTouchEvent如果在onTouch中消费事件将不会执行onTouchEvent
//        customView.setOnTouchListener((v, event) -> {
//            Log.e("","onTouch"+event.getAction());
//
//            return false;
//        });
//        customView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("","onClick");
//            }
//        });
//        ObjectAnimator.ofFloat(customView,"translationX",0,100)
//                .setDuration(2000).start();

//customView.setAnimation(AnimationUtils.loadAnimation(this,R.anim.translate));//无法响应点击事件
    }

}