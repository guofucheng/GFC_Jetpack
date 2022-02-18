package com.jlj.demo1

import com.jlj.demo1.pack.BindElectricEngine
import com.jlj.demo1.pack.BindGasEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 9:49
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 9:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {
    @BindGasEngine
    @Binds
    abstract fun bindGasEngine(gasEngine: GasEngine):Engine

    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(electricEngine: ElectricEngine):Engine

}