package com.gfc.persontime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gfc.persontime.adapter.DataAdapter
import com.gfc.persontime.bean.MenuData
import com.gfc.persontime.constant.CalcType
import com.gfc.persontime.databinding.ActivityMainBinding
import com.gfc.persontime.utils.BizCalcUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)




        val datas = mutableListOf(
            MenuData("距离年后回京已有", BizCalcUtils.getDateFromBackBeijing(), CalcType.YEAR,false),
            MenuData("距离电商课程到期还有", BizCalcUtils.getDateFromLessonEnd(),CalcType.YEAR,true),
            MenuData("已坚持学习自考课程", BizCalcUtils.getDateFromStartLesson(),CalcType.MONTH,true),
            MenuData("已坚持执行上传", "0",CalcType.MONTH,true),
            MenuData("已保持定力", BizCalcUtils.getDateFromXY(),CalcType.MONTH,true),
            MenuData("2021今年已过去", BizCalcUtils.getDateFromPast(),CalcType.YEAR,true)

        )

        binding.apply {
            rvDataList.layoutManager= LinearLayoutManager(this@MainActivity)
            rvDataList.adapter = DataAdapter(R.layout.data_items, datas)
        }


    }
}