package com.gfc.javaproject;

/**
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/8/20 14:02
 * @UpdateUser:
 * @UpdateDate: 2021/8/20 14:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SubjectImpl implements Subject{
    @Override
    public void hello(String param) {
        System.out.println("hello "+param);
    }
}
