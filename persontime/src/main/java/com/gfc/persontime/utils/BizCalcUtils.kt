package com.gfc.persontime.utils

import java.text.SimpleDateFormat
import java.util.*

class BizCalcUtils {


    companion object CalcDate{

        /**
         * 从北京回来多少天
         */
        fun getDateFromBackBeijing():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-02-23 00:00:00")
            val d2 = Date()

            return "${daysBetween(d1, d2)}"
        }

        /**
         * 离课程结束多少天
         */
        fun getDateFromLessonEnd():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = Date()
            val d2 = sdf.parse("2021-08-17 00:00:00")

            return "${daysBetween(d1, d2)}"
        }

        /**
         * 坚持不玩游戏多少天
         */
        fun getDateFromStartLesson():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-04-04 20:00:00")
            val d2 =  Date()

            return "${daysBetween(d1, d2)}"
        }
        /**
         * 坚持不玩游戏多少天
         */
        fun getDateFromStartLesson2():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-04-07 20:00:00")
            val d2 =  Date()

            return "${daysBetween(d1, d2)}"
        }
        /**
         * 坚持早睡多少天
         */
        fun getDateFromXY():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-04-05 20:00:00")
            val d2 =  Date()

            return "${daysBetween(d1, d2)}"
        }
        /**
         * 坚持保持多少天
         */
        fun getDateFromKeepMy():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-04-07 20:00:00")
            val d2 =  Date()

            return "${daysBetween(d1, d2)}"
        }
        /**
         * 坚持保持多少天
         */
        fun getDateFromKeep():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-04-05 20:00:00")
            val d2 =  Date()

            return "${daysBetween(d1, d2)}"
        }
        /**
         * 已过去多少天
         */
        fun getDateFromPast():String{

            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val d1 = sdf.parse("2021-01-01 00:00:00")
            val d2 =  Date()

            return "${daysBetween(d1, d2)}"
        }
        fun daysBetween(smdate:Date?,bdate:Date?):Int{

            val sdf = SimpleDateFormat("yyyy-MM-dd")
            val cal = Calendar.getInstance()
            cal.time = sdf.parse(sdf.format(smdate))
            val time1 = cal.timeInMillis
            cal.time = sdf.parse(sdf.format(bdate))
            val time2 = cal.timeInMillis
            val between_days = (time2 - time1) / (1000 * 3600 * 24)

            return between_days.toString().toInt()

        }

        fun daysBetween(smdate: String?, bdate: String?): Int {
            val sdf = SimpleDateFormat("yyyy-MM-dd")
            val cal = Calendar.getInstance()
            cal.time = sdf.parse(smdate)
            val time1 = cal.timeInMillis
            cal.time = sdf.parse(bdate)
            val time2 = cal.timeInMillis
            val between_days = (time2 - time1) / (1000 * 3600 * 24)
            return between_days.toString().toInt()
        }
    }

}