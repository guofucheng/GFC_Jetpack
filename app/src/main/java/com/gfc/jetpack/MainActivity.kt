package com.gfc.jetpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gfc.jetpack.base.BaseActivity
import com.gfc.jetpack.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    override fun getTag(): String ="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.btns1.setOnClickListener {

            startActivity(Intent(this@MainActivity,MainActivityA1::class.java))

        }
    }
}