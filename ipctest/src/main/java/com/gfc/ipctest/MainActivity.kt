package com.gfc.ipctest

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.os.IBinder
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.gfc.ipctest.service.DownloadService


class MainActivity : AppCompatActivity() {
    var service:DownloadService ?=null

    val viewModel:MyViewModel by viewModels()



    val conn= object : ServiceConnection{
        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) {
            val myBinder: DownloadService.MyBinder= binder as DownloadService.MyBinder



        }

        override fun onServiceDisconnected(name: ComponentName?) {

        }


    }
//    private val conn: ServiceConnection = object : ServiceConnection {
//        override fun onServiceConnected(name: ComponentName, binder: IBinder) {
//            isBound = true
//            val myBinder: MyBinder = binder as MyBinder
//            service = myBinder.getService()
//            Log.i("DemoLog", "ActivityA onServiceConnected")
//            val num: Int = service.getRandomNumber()
//            Log.i("DemoLog", "ActivityA 中调用 TestService的getRandomNumber方法, 结果: $num")
//        }
//
//        override fun onServiceDisconnected(name: ComponentName) {
//            isBound = false
//            Log.i("DemoLog", "ActivityA onServiceDisconnected")
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_startservice)
            .setOnClickListener {


                startService(Intent(this, DownloadService::class.java))//一启动就直到销毁

            }

        findViewById<Button>(R.id.btn_stopservice)
            .setOnClickListener {

                stopService(Intent(this, DownloadService::class.java))//停止Service
            }




    }
}