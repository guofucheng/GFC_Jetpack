package com.jlj.demo1

import javax.inject.Inject

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 9:43
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 9:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class GasEngine @Inject constructor():Engine {
    override fun start() {
        println("Gas engine start.")
    }

    override fun stop() {
        println("Gas engine stop.")
    }
}