package com.gfc.jetpack.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    abstract fun getTag():String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(getTag(),"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e(getTag(),"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(getTag(),"onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.e(getTag(),"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(getTag(),"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(getTag(),"onDestroy")
    }

    override fun onRestart() {
        super.onRestart()

        Log.e(getTag(),"onRestart")
    }



}