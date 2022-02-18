package com.gfc.jetpack

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import dagger.hilt.android.HiltAndroidApp

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/5/6 13:35
 * @UpdateUser:
 * @UpdateDate: 2021/5/6 13:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@HiltAndroidApp
class MyApplication :Application() {

    override fun onCreate() {
        super.onCreate()

    }



}