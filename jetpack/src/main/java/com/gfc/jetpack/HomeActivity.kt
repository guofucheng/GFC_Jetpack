package com.gfc.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gfc.jetpack.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.internal.ComponentEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var networkUtil:NetworkUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


       val binding:ActivityHomeBinding=  DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.stu= Student("鱼新建","24","稳恩佳力佳")
        binding.button.setOnClickListener {

            networkUtil.sprint()

        }












    }




}