package com.gfc.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gfc.jetpack.base.BaseActivity

class MainActivityA2 : BaseActivity() {
    override fun getTag(): String ="MainActivityA2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_a2)
    }
}