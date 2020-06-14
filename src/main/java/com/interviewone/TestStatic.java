package com.interviewone;

import com.sun.jmx.remote.internal.ArrayQueue;
import org.openjdk.jol.info.ClassLayout;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/28 21:17
 */
public class TestStatic {
    public static void main(String[] args) {
        System.out.println();
        Queue<String> queue = new LinkedBlockingDeque<>();
        queue.add("j");
        queue.add("h");
        System.out.println(queue.peek());
        Stack<java.io.Serializable> stack = new Stack<>();
        stack.push(11);
        stack.push("kkk");
        stack.push("jiej");
        System.out.println(stack.peek());
        Vector vector = new Vector();
        Vector f = new Stack();

        Stack<Integer> d = new Stack<>();
        d.push(12);
        ArrayList sa = new ArrayList();
        LinkedList linkedList = new LinkedList();
       // Queue queue1 = new ArrayQueue<>();
        Queue<Integer> queue12 = new ArrayBlockingQueue<Integer>(4);

        Queue queue25 = new ConcurrentLinkedDeque();
        queue12.add(10);
        ArrayBlockingQueue<Integer> queue211 = new ArrayBlockingQueue<Integer>(10);
        boolean add = queue211.add(10);
        System.out.println(add);
        Set sett = new HashSet(12);
        sett.add(10);
        sett.add(10);
        sett.add(26);

        Iterator<Integer> it = sett.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("==================");
        System.out.println();

        TreeMap treeMap = new TreeMap();
        Hashtable hs = new Hashtable();
        hs.put(10,10);
        // 区分是不是桶元素然后删除元素
        hs.remove(10);
        ConcurrentHashMap a = new ConcurrentHashMap();
        TreeSet hh = new TreeSet();
        hh.add(1);
        hh.add(23);
        hh.add(2);
        Iterator s = hh.iterator();
        while (s.hasNext()){
            System.out.println(s.next());
        }

        LinkedHashSet linkedHashSet  = new LinkedHashSet();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object o = new Object();
        // 查看 markword的最核心的类 jar 为 jol-core
        System.out.println(ClassLayout.parseInstance(o).toPrintable());


        Thread t2 = new Thread(()->{
            for(int i = 0;i < 38; i++){
                synchronized (o){
                    if(i == 18 || i == 19 || i == 20|| i == 30 ){
                        System.out.println("t2线程： 第"+(i+1)+"次偏向结果");
                        System.out.println((ClassLayout.parseInstance(o).toPrintable()));
                    }
                }
            }
        });

    }

}
