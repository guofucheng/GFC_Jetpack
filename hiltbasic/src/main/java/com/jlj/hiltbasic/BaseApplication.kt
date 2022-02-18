package com.jlj.hiltbasic

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 13:46
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 13:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@HiltAndroidApp
class BaseApplication :Application(){

    override fun onCreate() {
        super.onCreate()
        
    }
}