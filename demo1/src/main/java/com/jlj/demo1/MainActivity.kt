package com.jlj.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jlj.demo1.pack.BindElectricEngine
import com.jlj.demo1.pack.BindGasEngine
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var truck1: Truck

    @Inject
    lateinit var okHttpClient: OkHttpClient


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        truck1.deliver()

        Log.e("",okHttpClient.toString())

    }
}