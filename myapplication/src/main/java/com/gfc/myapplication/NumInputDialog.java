package com.gfc.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;


/**

 */
public class NumInputDialog extends DialogFragment {

    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_point;
    private Button btn_clear;
    private Button btn_cancel;
    private Button btn_confirm;
    private TextView tv_revet;
    private StringBuffer sbuBuffer = new StringBuffer();
    /**
     * 是否append小数点
     */
    private boolean isAppendPoint = false;
    /**
     * 小数点后两位数字是否变化,若变化，则再次输入数字，则不改变结果显示
     */
    private boolean isPointTwoState = false;
    /**
     * 小数点后(第一次点击小数点后)第一位数字是否为零
     */
    private boolean isPoint0;
    private String unitName = "元";
    private OnDataCallback onDataCallback;

    public void setOnDataCallback(OnDataCallback onDataCallback) {
        this.onDataCallback = onDataCallback;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View inflate = inflater.inflate(R.layout.fragment_caculate_page,
                container, false);
        Bundle arguments = getArguments();

        unitName = arguments.getString("unit");
        if (unitName==null){
            unitName="元";
        }
        if (unitName.equals("00")){
            unitName="升";
        }else if (unitName.equals("01")){
            unitName="元";
        }
        initViewControl(inflate);
        return inflate;
    }
    public interface OnDataCallback{
        void onInput(String str);
    }
    private void initViewControl(View view) {
        btn_0 = view.findViewById(R.id.btn_0);
        btn_1 = view.findViewById(R.id.btn_1);
        btn_2 = view.findViewById(R.id.btn_2);
        btn_3 = view.findViewById(R.id.btn_3);
        btn_4 = view.findViewById(R.id.btn_4);
        btn_5 = view.findViewById(R.id.btn_5);
        btn_6 = view.findViewById(R.id.btn_6);
        btn_7 = view.findViewById(R.id.btn_7);
        btn_8 = view.findViewById(R.id.btn_8);
        btn_9 = view.findViewById(R.id.btn_9);
        btn_clear = view.findViewById(R.id.btn_clear);
        btn_point = view.findViewById(R.id.btn_point);
        btn_confirm = view.findViewById(R.id.btn_confirm);
        btn_cancel = view.findViewById(R.id.btn_cancel);
        tv_revet = view.findViewById(R.id.tv_rest);
        tv_revet.setText("0.00" + unitName);//赋值默认值

        keyPassClick keyPassClick = new keyPassClick(this.getActivity());
        btn_0.setOnClickListener(keyPassClick);
        btn_1.setOnClickListener(keyPassClick);
        btn_2.setOnClickListener(keyPassClick);
        btn_3.setOnClickListener(keyPassClick);
        btn_4.setOnClickListener(keyPassClick);
        btn_5.setOnClickListener(keyPassClick);
        btn_6.setOnClickListener(keyPassClick);
        btn_7.setOnClickListener(keyPassClick);
        btn_8.setOnClickListener(keyPassClick);
        btn_9.setOnClickListener(keyPassClick);
        btn_point.setOnClickListener(keyPassClick);
        btn_clear.setOnClickListener(keyPassClick);
        btn_confirm.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

//                cardFragment.confrimCallBack(, unitName);
                if (TextUtils.isEmpty(sbuBuffer.toString())) {
                    sbuBuffer.append("0");
                }
                onDataCallback.onInput(sbuBuffer.toString().trim());
                dismiss();
            }
        });
        btn_cancel.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                dismiss();
            }
        });



    }

    @Override
    public void onStart() {
        super.onStart();
//        DisplayMetrics dm = new DisplayMetrics();
//        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        getDialog().getWindow().getAttributes().gravity = Gravity.CENTER;

        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        getDialog().getWindow().setLayout(dm.widthPixels,
                dm.heightPixels);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        btn_0 = null;
        btn_1 = null;
        btn_2 = null;
        btn_3 = null;
        btn_4 = null;
        btn_5 = null;
        btn_6 = null;
        btn_7 = null;
        btn_8 = null;
        btn_9 = null;
        btn_point = null;
        btn_clear = null;
        btn_cancel = null;
        btn_confirm = null;
        tv_revet = null;
        sbuBuffer = null;
        isAppendPoint = false;
        isPointTwoState = false;
        isPoint0 = false;
        unitName = null;
    }

    class keyPassClick implements OnClickListener {

        //private Context context;
        public keyPassClick(Context context) {
            //this.context = context;
        }

        @Override
        public void onClick(View view) {
            String text = null;
            //第一步先清除.00结尾的数字
            if (sbuBuffer.indexOf(".") != -1) {
                if (sbuBuffer.substring(sbuBuffer.indexOf("."), sbuBuffer.length()).equals(".00")) {
                    sbuBuffer.delete(sbuBuffer.indexOf("."), sbuBuffer.length());
                }
            }
            if (view.getId() == R.id.btn_clear) {//清数按钮，恢复状态初始值
                sbuBuffer.delete(0, sbuBuffer.length());
                isAppendPoint = false;
                isPointTwoState = false;
                isPoint0 = false;
            } else {
                text = ((Button) view).getText().toString();
            }
            if (text != null) {
                if (text.equals(".")) {//判断点
                    isAppendPoint = true;
                    //这里判断当前结果是否有两位小数
                    if (sbuBuffer.indexOf(".") == -1) {
                        //判断当前结果是否为空(这里是打开页面第一按下点的情况)
                        if (TextUtils.isEmpty(sbuBuffer.toString())) {
                            sbuBuffer.append("0");
                        }
                        sbuBuffer.append(".00");
                    }
                } else {
                    if (!isAppendPoint) {
                        if (TextUtils.isEmpty(sbuBuffer.toString())) {
                            sbuBuffer.append("0");
                        }
                        if ((sbuBuffer.toString().equals("0") && text.equals("0"))
                                || sbuBuffer.toString().equals("0")) {
                            sbuBuffer.delete(0, 1);
                        }
                        if (sbuBuffer.length() < 4) {
                            sbuBuffer.append(text).append(".00");
                        } else {
                            sbuBuffer.append(".00");
                        }
                    } else {
                        //判断点是不是为-1
                        if (isPoint0 || sbuBuffer.indexOf(".") != -1) {
                            if (!isPointTwoState) {
                                //这里需要对小数点后（第一次输入是零的情况，进行判断）若是，则在后面加上.00
                                if (isPoint0) {
                                    sbuBuffer.append(".00");
                                }

                                //判断点的位置是不是在倒数第三位
                                if (sbuBuffer.indexOf(".") == (sbuBuffer.length() - 3)) {
                                    //取最后一位数字，判断是否为零,若为零，则删除
                                    String end1 = sbuBuffer.substring(sbuBuffer.length() - 1, sbuBuffer.length());
                                    if (end1.equals("0")) {
                                        sbuBuffer.delete(sbuBuffer.length() - 1, sbuBuffer.length());
                                    }
                                    sbuBuffer.append(text);
                                    isPointTwoState = true;
                                }
                            }
                        } else {
                            //这个是第一次按点(在之后，开始按其他数字键)
                            if (TextUtils.equals(text, "0")) {
                                isPoint0 = true;
                            }
                            sbuBuffer.append(".").append(text).append("0");
                        }
                    }
                }
            }
            updateRevetText(sbuBuffer.toString());
        }
    }

    /**
     * 更新显示的预置数据
     *
     * @param textValue
     */
    private void updateRevetText(String textValue) {
        if (TextUtils.isEmpty(sbuBuffer.toString())) {
            tv_revet.setText("0.00" + unitName);
        } else {
            tv_revet.setText(sbuBuffer.toString() + unitName);
        }
    }
}
