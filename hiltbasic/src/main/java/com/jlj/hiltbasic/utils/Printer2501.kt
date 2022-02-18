package com.jlj.hiltbasic.utils

import android.util.Log
import javax.inject.Inject

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 14:10
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 14:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class Printer2501 @Inject constructor():IPrinter {

    override fun cutPaper() {
        Log.e("","Printer2501正在切纸")
    }

    override fun setSize(size: Int) {
        Log.e("","Printer2501正在设置大小")
    }

    override fun printInfo(msg: String) {
        Log.e("","Printer2501正在打印$msg")
    }
}