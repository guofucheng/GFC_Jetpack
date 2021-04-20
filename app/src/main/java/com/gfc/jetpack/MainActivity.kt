package com.gfc.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.gfc.jetpack.base.BaseActivity
import com.gfc.jetpack.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {
    override fun getTag(): String ="MainActivity"

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

//
//    override fun onDetachedFromWindow() {
//        super.onDetachedFromWindow()
//        print("onDetachedFromWindow")
//        val mBinding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(mBinding.root)
//        mBinding.btns1.setOnClickListener {
//
//            startActivity(Intent(this@MainActivity,MainActivityA1::class.java))
//
//        }
//    }
}