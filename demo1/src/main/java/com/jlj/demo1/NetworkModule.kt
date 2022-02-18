package com.jlj.demo1

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2022/2/18 11:07
 * @UpdateUser:
 * @UpdateDate: 2022/2/18 11:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@InstallIn(ActivityComponent::class)
@Module
class NetworkModule {


    @Singleton
    @Provides
    fun provideOkhttp():OkHttpClient{
        return OkHttpClient.Builder()
            .connectTimeout(20,TimeUnit.SECONDS)
            .writeTimeout(20,TimeUnit.SECONDS)
            .readTimeout(20,TimeUnit.SECONDS)
            .build()


    }

}