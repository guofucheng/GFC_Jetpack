package com.gfc.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMsgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_msg)

        val stringExtra = intent.getStringExtra("asd")

        val txt=findViewById<TextView>(R.id.textView2).apply {
            text=stringExtra
        }
    }
}