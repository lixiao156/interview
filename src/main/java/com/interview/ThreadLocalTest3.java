package com.interview;

import java.util.concurrent.TimeUnit;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 13:17
 */
public class ThreadLocalTest3 {

    static ThreadLocal<Person> t1 = new ThreadLocal<Person>();
    public static void main(String[] args) {
        new Thread(()->{
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t1.get());
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1.set(new Person());
        }).start();
    }
    // 线程为key是错误的，开始抠原理源码，需要会读源码

}
