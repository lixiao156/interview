package com.interview;

import java.util.Arrays;
import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/12 20:43
 */
public class LocalThreadTest {

    static ThreadLocal<String> localVar = new ThreadLocal<>();
    // 自定义方法
    static void print(String str) {
        //打印当前线程中本地内存中本地变量的值
        System.out.println(str + " :" + localVar.get());
        //清除本地内存中的本地变量
        localVar.remove();
    }

    public static void main(String[] args) {
        //  创建新的线程
        Thread t1  = new Thread(new Runnable() {
            // 启动线程
            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar1");
                //调用打印方法
                print("thread1");
                //打印本地变量
                System.out.println("after remove : " + localVar.get());
            }
        });

        Thread t2  = new Thread(new Runnable() {

            @Override
            public void run() {
                //设置线程1中本地变量的值
                localVar.set("localVar2");
                //调用打印方法
                print("thread2");
                //打印本地变量
                System.out.println("after remove : " + localVar.get());
            }
        });

        t1.start();
        t2.start();
    }

}
