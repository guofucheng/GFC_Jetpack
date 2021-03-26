package com.gfc.jetpack.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.gfc.jetpack.R
import com.gfc.jetpack.base.BaseVmFragment
import com.gfc.jetpack.common.toast
import com.gfc.jetpack.databinding.FragmentLoginBinding


class LoginFragment : BaseVmFragment() {

    private lateinit var loginVM:LoginVM

    override fun initViewModel() {
        loginVM=getFragmentViewModel(LoginVM::class.java)
        loginVM.login()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = FragmentLoginBinding.inflate(inflater)
        return binding.root
    }

    override fun init(savedInstanceState: Bundle?) {


    }

    override fun getLayoutId(): Int = R.layout.fragment_login



    override fun observe() {
        loginVM.loginLiveData.observe(this, Observer {

            toast("sucf")


        })
        loginVM.errorLiveData.observe(this, Observer {

            toast("111")
        })
    }


}