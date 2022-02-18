package com.jlj.hiltbasic.utils

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 14:05
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 14:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
interface IPrinter {

    fun cutPaper()

    fun setSize(size:Int)

    fun printInfo(msg:String)


}