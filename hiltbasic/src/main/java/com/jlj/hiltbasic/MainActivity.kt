package com.jlj.hiltbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jlj.hiltbasic.databinding.ActivityMainBinding
import com.jlj.hiltbasic.di.AnnoPrint2501
import com.jlj.hiltbasic.di.AnnoPrint3058
import com.jlj.hiltbasic.utils.IPrinter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @AnnoPrint2501
    @Inject
    lateinit var iPrinter2501: IPrinter

    @AnnoPrint3058
    @Inject
    lateinit var iPrinter3058: IPrinter


    lateinit var contentView :ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contentView= DataBindingUtil.setContentView(this, R.layout.activity_main)
        contentView.buttonA.setOnClickListener {

            iPrinter2501.setSize(22)
            iPrinter2501.printInfo("asd")
            iPrinter2501.cutPaper()
        }
        contentView.buttonB.setOnClickListener {
            iPrinter3058.setSize(21)
            iPrinter3058.printInfo("qwe")
            iPrinter3058.cutPaper()

        }

    }
}