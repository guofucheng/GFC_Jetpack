package com.gfc.jetpack.base

import android.app.Application
import android.content.Context

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/3/25 16:40
 * @UpdateUser:
 * @UpdateDate: 2021/3/25 16:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
open class BaseApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        baseApplication = this
    }
    companion object{
        private lateinit var baseApplication: BaseApplication

        fun getContext():Context{

            return baseApplication
        }

    }

}