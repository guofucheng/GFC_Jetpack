package com.gfc.persontime

import org.junit.Test

import org.junit.Assert.*
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DateFormat
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val calendar = Calendar.getInstance()
        val hour=calendar.get(Calendar.HOUR)
        val min=calendar.get(Calendar.MINUTE)
        val current=hour*60+min
        val whole=24*60
        println("当前 $current 分钟/$whole")

        val s1=BigDecimal(whole)
        val s2=BigDecimal(current)
        println("当前 ${s2.divide(s1,2,RoundingMode.FLOOR).multiply(BigDecimal(100)).toDouble()}")

    }
}