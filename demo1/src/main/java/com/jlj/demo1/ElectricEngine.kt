package com.jlj.demo1

import javax.inject.Inject

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 9:44
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 9:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class ElectricEngine @Inject constructor() :Engine {
    override fun start() {
        println("Electric engine start.")

    }

    override fun stop() {
        println("Electric engine stop.")
    }
}