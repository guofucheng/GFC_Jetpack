package com.jlj.hiltbasic.di

import com.jlj.hiltbasic.utils.IPrinter
import com.jlj.hiltbasic.utils.Printer2501
import com.jlj.hiltbasic.utils.Printer3058
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 14:16
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 14:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class PrinterModule {


    @AnnoPrint2501
    @Binds
    abstract fun bindPrinter2501(printer2501: Printer2501):IPrinter

    @AnnoPrint3058
    @Binds
    abstract fun bindPrinter3058(printer3058: Printer3058):IPrinter


}