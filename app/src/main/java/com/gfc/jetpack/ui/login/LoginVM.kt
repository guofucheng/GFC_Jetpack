package com.gfc.jetpack.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gfc.jetpack.base.BaseViewModel
import com.zs.wanandroid.entity.UserBean

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
class LoginVM :BaseViewModel(){

    val loginLiveData=MutableLiveData<UserBean>()

    private val repo by lazy { LoginRepo(viewModelScope,errorLiveData) }

    fun login(){
        repo.login("","",loginLiveData)

    }


}