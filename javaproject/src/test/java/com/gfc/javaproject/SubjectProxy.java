package com.gfc.javaproject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description: java类作用描述
 * @Author: Mark Guo
 * @CreateDate: 2021/8/20 14:02
 * @UpdateUser:
 * @UpdateDate: 2021/8/20 14:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SubjectProxy implements InvocationHandler {

    public Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("begin");

        Object invoke = method.invoke(subject, args);


        System.out.println("end");


        return invoke;
    }
}
