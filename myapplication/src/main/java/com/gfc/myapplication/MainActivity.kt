package com.gfc.myapplication


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UniversalInputDialog.OnDataCallback {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_verify.setOnClickListener {

            val universalInputDialog = UniversalInputDialog()
            val args = Bundle()
//            args.putInt("INPUT_TYPE", Common.INPUT_TYPE_CODE)
//            universalInputDialog.arguments = args
//            universalInputDialog.setOnDataCallback(this)
//            universalInputDialog.codeMaxLen = 6
//            universalInputDialog.show(supportFragmentManager, "universalInputDialog")

            args.putInt("INPUT_TYPE", Common.INPUT_TYPE_MONEY)
            universalInputDialog.arguments = args
            universalInputDialog.setOnDataCallback(this)
            universalInputDialog.maxLimit=9999.99
            universalInputDialog.show(supportFragmentManager, "universalInputDialog")
        }


    }

    override fun onInput(str: String?) {
        Toast.makeText(this, str!!, Toast.LENGTH_SHORT).show()
        tv_verify.text = str
    }

}