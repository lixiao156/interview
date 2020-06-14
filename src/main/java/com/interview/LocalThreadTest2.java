package com.interview;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import static javax.swing.plaf.synth.Region.LIST;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 11:32
 */
public class LocalThreadTest2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        PhantomReference<M> phantomReference = new PhantomReference<M>(new M(), new ReferenceQueue<>());
        System.out.println(phantomReference.get());

        new Thread(()->{
            while(true){
                list.add(new byte[1024*1024]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(phantomReference.get());

            }
        }).start();

        new Thread(()->{
            while (true){
//                Reference<? extends M> poll  =
            }
        }).start();

    }
}
