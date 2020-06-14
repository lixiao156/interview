package com.interview;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/8 10:05
 */
public class ThreadPool {
    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);
        arrayBlockingQueue.add(10);
    }
}
