package com.gfc.persontime.bean

import com.gfc.persontime.constant.CalcType


/**
 * calType:计算类型：年、月计算
 */
data class MenuData (var title:String, var value: String, var calType: CalcType, var isShowProcess: Boolean){

}