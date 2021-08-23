package com.gfc.javaproject;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    @Test
    public void addition_isCorrect() throws InterruptedException {

        Subject subject = new SubjectImpl();

        InvocationHandler subjectProxy = new SubjectProxy(subject);

        Subject subject1 = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
        subject1.hello("asd");


//
//        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();//单端FIFO队列 链表实现
//        LinkedBlockingDeque<String> queue1 = new LinkedBlockingDeque<>();//双端队列 链表实现
//        ArrayBlockingQueue<String> queue2 = new ArrayBlockingQueue<>(100, false);//循环数组实现公平参数：等待最长的线程会优先处理
//        PriorityBlockingQueue<String> queue3 = new PriorityBlockingQueue<>();//带优先级的队列 用堆实现
//        DelayQueue queue4 = new DelayQueue();
//        TransferQueue<String> queue5 = new LinkedTransferQueue<>();//生产者线程等待，直到消费者准备就绪可以接收一个元素
//        queue5.transfer("asd");
//
//        ConcurrentLinkedQueue concurrentLinkedQueue=new ConcurrentLinkedQueue();//非阻塞式无边界访问队列
////        ConcurrentLinkedQueue concurrentLinkedQueue2=new ConcurrentSkipListSet();//非阻塞式无边界访问队列
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