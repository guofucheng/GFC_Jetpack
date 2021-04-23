package com.gfc.ipctest.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log

class DownloadService : Service() {

    private val TAG = "DownloadService"

    //在每个service的生命周期中这个方法会且仅会调用一次，并且它的调用在onStartCommand()以及onBond()之前，我们可以在这个方法中进行一些一次性的初始化工作。
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"onCreate")

//        stopSelf()//停止自身
    }

    //当其他组件通过startService()方法启动service时，此方法将会被调用。
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG,"onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }


    //当其他组件通过bindService()方法与service相绑定之后，此方法将会被调用。这个方法有一个IBinder的返回值，
    // 这意味着在重写它的时候必须返回一个IBinder对象，它是用来支撑其他组件与service之间的通信的——另外，
    // 如果你不想让这个service被其他组件所绑定，可以通过在这个方法返回一个null值来实现。
    //————————————————
    override fun onBind(intent: Intent): IBinder? {
        return myBinder
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return false
    }


    var myBinder:MyBinder= MyBinder()

    class MyBinder :Binder(){

        fun getService():MyBinder{
            return this@MyBinder
        }

    }


    //这是service一生中调用的最后一个方法，当这个方法被调用之后，service就会被销毁。所以我们应当在这个方法里面进行一些资源的清理，比如注册的一些监听器什么的。
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")

    }
}