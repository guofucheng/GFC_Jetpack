package com.gfc.javaproject;

import android.util.Log;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TransferQueue;
import java.util.function.BiFunction;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public void ss(List<?> ssss){

        for (Object s:ssss
             ) {

        }

    }

    public <T> void sss(T t){


    }


    public <T> void print(T... ts){

        for (T t: ts) {
            System.out.println("===:"+t);
        }
    }


    @Test
    public void addition_isCorrect() throws InterruptedException {

        print("asd",2,44.2f);
        Student<String> str=new Student<>();
        str.setScore("asd");


        MyClass<Student<String>> cls=new MyClass<>();
        cls.setCls(str);


        Student<String> cls1 = cls.getCls();


        Map<String,String> map=new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries)
        {
            entry.getKey();

        }


//
//        Subject subject = new SubjectImpl();
//
//        InvocationHandler subjectProxy = new SubjectProxy(subject);
//
//        Subject subject1 = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
//        subject1.hello("asd");


//
//        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();//??????FIFO?????? ????????????
//        LinkedBlockingDeque<String> queue1 = new LinkedBlockingDeque<>();//???????????? ????????????
//        ArrayBlockingQueue<String> queue2 = new ArrayBlockingQueue<>(100, false);//?????????????????????????????????????????????????????????????????????
//        PriorityBlockingQueue<String> queue3 = new PriorityBlockingQueue<>();//????????????????????? ????????????
//        DelayQueue queue4 = new DelayQueue();
//        TransferQueue<String> queue5 = new LinkedTransferQueue<>();//???????????????????????????????????????????????????????????????????????????
//        queue5.transfer("asd");
//
//        ConcurrentLinkedQueue concurrentLinkedQueue=new ConcurrentLinkedQueue();//?????????????????????????????????
////        ConcurrentLinkedQueue concurrentLinkedQueue2=new ConcurrentSkipListSet();//?????????????????????????????????
//
//        ConcurrentHashMap<String,String> concurrentHashMap=new ConcurrentHashMap<>();
//        concurrentHashMap.search(2, (s, s2) -> null);
//        Set<String> objects = ConcurrentHashMap.newKeySet();
//
////        CopyOnWriteArrayList
//
////        Arrays.parallelSort();
//
//        List<String> objects1 = Collections.synchronizedList(new ArrayList<>());
//        queue.put("asd");
//        queue.put("qwe");
//        queue.put("zxc");
//
//        System.out.println(queue.take());
//        System.out.println(queue.take());
//        System.out.println(queue.take());


















    }
}