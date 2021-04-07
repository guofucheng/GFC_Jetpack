package com.gfc.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    fun print(str:String){
        Log.e(TAG,str)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("onCreate")
    }

    override fun onStart() {
        super.onStart()
        print("onStart")
    }

    override fun onResume() {
        super.onResume()
        print("onResume")
    }

    override fun onPause() {
        super.onPause()
        print("onPause")
    }

    override fun onStop() {
        super.onStop()
        print("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        print("onLowMemory")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        print("onAttachedToWindow")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        print("onDetachedFromWindow")
    }
}