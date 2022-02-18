package com.gfc.myapplication

import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.widget.Button
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_caculate_page.*
import java.math.BigDecimal

/**
 *
 * @Description:
 * 支持纯验证码类型纯数字输入
 * 支持金额类型小数输入
 * 支持密码类型输入
 * @Author: Mark Guo
 * @CreateDate: 2021/11/18 9:57
 * @UpdateUser:
 * @UpdateDate: 2021/11/18 9:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
class UniversalInputDialog : DialogFragment(),View.OnClickListener {
    private var onDataCallback: UniversalInputDialog.OnDataCallback? = null
    var mType:Int ?=0
    var codeMaxLen:Int =6//验证码最大长度
    var maxLimit:Double =0.0//金额最大限制
    private val sbuBuffer = StringBuffer()


    var mMoney:Double ?=0.0

    fun setOnDataCallback(onDataCallback: UniversalInputDialog.OnDataCallback?) {
        this.onDataCallback = onDataCallback
    }


    interface OnDataCallback {
        fun onInput(str: String?)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)



        return inflater.inflate(
            R.layout.fragment_caculate_page,
            container, false
        )
    }

    override fun onStart() {
        super.onStart()
        dialog!!.window!!.attributes.gravity = Gravity.CENTER
        val dm = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(dm)
        dialog!!.window!!.setLayout(
            dm.widthPixels,
            dm.heightPixels
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mType = arguments?.getInt("INPUT_TYPE")

        when (mType) {
            Common.INPUT_TYPE_CODE -> {
                btn_point.visibility=View.GONE
                updateValue("")
            }
            Common.INPUT_TYPE_MONEY -> {
                btn_point.visibility=View.VISIBLE
                updateValue(mMoney.toString())
            }
            else -> {
            }
        }



        btn_0.setOnClickListener(this)
        btn_1.setOnClickListener(this)
        btn_2.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_5.setOnClickListener(this)
        btn_6.setOnClickListener(this)
        btn_7.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_point.setOnClickListener(this)
        btn_clear.setOnClickListener(this)
        btn_confirm.setOnClickListener(this)
        btn_cancel.setOnClickListener(this)
    }




    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_cancel->{
                dismiss()
            }
            R.id.btn_confirm->{
                onDataCallback!!.onInput(tv_rest.text.toString())
                dismiss()
            }
            R.id.btn_clear->{
                //清数按钮，恢复状态初始值

                sbuBuffer.delete(0, sbuBuffer.length)
                when (mType) {
                    Common.INPUT_TYPE_CODE -> {
                        updateValue(sbuBuffer.toString())
                    }
                    Common.INPUT_TYPE_MONEY -> {
                        updateValue("0.0")
                    }
                }


            }
            R.id.btn_0,R.id.btn_1,R.id.btn_2,R.id.btn_3,R.id.btn_4,R.id.btn_5
                ,R.id.btn_6,R.id.btn_7,R.id.btn_8,R.id.btn_9,R.id.btn_point-> {

                val ss= v as Button


                when (mType) {
                    Common.INPUT_TYPE_CODE -> {

                        if (sbuBuffer.length<codeMaxLen){
                            sbuBuffer.append(ss.text.toString())
                            updateValue(sbuBuffer.toString())
                        }


                    }
                    Common.INPUT_TYPE_MONEY -> {

                        sbuBuffer.append(ss.text.toString())
                        Log.e("",sbuBuffer.toString())
                        val b = BigDecimal(sbuBuffer.toString())
                        val sbMoney: Double = b.setScale(2, BigDecimal.ROUND_HALF_UP).toDouble()

                            if (sbMoney <= maxLimit) {
                                updateValue(sbMoney.toString())
                            }

                    }
                    else -> {
                    }
                }


            }
            else -> {
            }
        }


    }
    fun updateValue(value:String){
        tv_rest.text=value
    }
}