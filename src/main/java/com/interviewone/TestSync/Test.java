package com.interviewone.TestSync;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/4 14:51
 */
public class Test {
    static L l = new L();
    static ReentrantLock reentrantLock = new ReentrantLock();
    public static void main(String[] args) {

        reentrantLock.lock();
        System.out.println("dief");
        reentrantLock.unlock();

//        L l = new L();
        // sync 上锁是改变对象的对象头
        // 什么是对象头？--java对象的布局--java对象由什么组成--对象在堆上面到底要分配多大的内存
        // 1.java对象的实例数据-不固定
        //2.对象头--固定
        //3.数据对齐
        //4.
        synchronized (l) {
            System.out.println("hello");
        }

    }
}
