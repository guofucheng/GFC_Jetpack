package com.gfc.jetpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gfc.jetpack.base.BaseActivity

class MainActivityA1  : BaseActivity() {
    override fun getTag(): String ="MainActivityA1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_a1)

        val btn=findViewById<Button>(R.id.button2)
        btn.setOnClickListener {

            startActivity(Intent(this@MainActivityA1,MainActivityA2::class.java))
            finish()
        }
    }
}