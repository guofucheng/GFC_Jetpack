package com.gfc.persontime.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.gfc.persontime.R
import com.gfc.persontime.bean.MenuData
import com.gfc.persontime.constant.CalcType
import java.math.BigDecimal

class DataAdapter(layoutResId: Int, data: MutableList<MenuData>?) :
    BaseQuickAdapter<MenuData, BaseViewHolder>(layoutResId, data) {

    override fun convert(helper: BaseViewHolder?, item: MenuData?) {

        helper?.apply {

            item?.run {


                val b1 = BigDecimal(item.value)

                val b2 = when (item.calType) {
                    CalcType.MONTH -> BigDecimal(30)
                    CalcType.YEAR -> BigDecimal(365)
                }

                if (isShowProcess) {

                    val percent = b1.divide(b2, 4, BigDecimal.ROUND_DOWN).multiply(BigDecimal(100))
                        .setScale(2).toInt()
                    setProgress(R.id.pb_progress, percent).setVisible(R.id.pb_progress,true)

                }else{
                    setGone(R.id.pb_progress,false)
                }
                setText(R.id.tv_title, item.title)
                    .setText(R.id.tv_value, item.value + "天")


            }

        }


    }
}