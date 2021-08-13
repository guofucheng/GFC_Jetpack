package com.gfc.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.gfc.myapplication.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun send(v:View){

        val edit=findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
        val intent=Intent(this,DisplayMsgActivity::class.java).apply {
            putExtra("asd","qwe")
        }
        startActivity(intent)

    }
}