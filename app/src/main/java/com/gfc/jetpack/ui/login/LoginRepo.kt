package com.gfc.jetpack.ui.login

import androidx.lifecycle.MutableLiveData
import com.gfc.jetpack.base.BaseRepository
import com.gfc.jetpack.http.ApiException
import com.gfc.jetpack.http.ApiService
import com.gfc.jetpack.http.RetrofitManager
import com.zs.wanandroid.entity.UserBean
import kotlinx.coroutines.CoroutineScope

/**
 *
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/3/26 11:29
 * @UpdateUser:
 * @UpdateDate: 2021/3/26 11:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class LoginRepo(coroutineScope: CoroutineScope, errorLiveData: MutableLiveData<ApiException>) :
    BaseRepository(coroutineScope, errorLiveData) {

        fun login(username:String,password:String,loginLiveData: MutableLiveData<UserBean>){
            launch(
                block = {

                        RetrofitManager.getApiService(ApiService::class.java)
                            .login(username,password)
                            .data()
                },
                success = {

                    loginLiveData.postValue(it)
                }
            )

        }









}