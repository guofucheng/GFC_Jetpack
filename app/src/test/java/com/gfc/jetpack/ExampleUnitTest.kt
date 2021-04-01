package com.gfc.jetpack

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//
//        val mn = getMN(89)
//        val east4 = listOf<String>("震", "巽", "坎", "离")
//        val west4 = listOf<String>("艮", "坤", "兑", "乾")
//        if (mn in east4) {
//            println("东四命$mn")
//        }
//        if (mn in west4) {
//            println("西四命$mn")
//        }


        val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
        val clothesBag = listOf("shirts","pants","jeans")           // 2
        val cart = listOf(fruitsBag, clothesBag)                    // 3
        val mapBag = cart.map { it }                                // 4
        val flatMapBag = cart.flatMap { it }                        // 5
        println(mapBag)
        println(flatMapBag)
    }

    val map = mutableMapOf<Int, String>(
            1 to "坎",
            2 to "坤",
            3 to "震",
            4 to "巽",
            5 to "中",
            6 to "乾",
            7 to "兑",
            8 to "艮",
            9 to "离",
            0 to "离"
    )


    fun getMN(year: Int): String? {


        val x = (100 - year) % 9

        return map[x]

    }
}