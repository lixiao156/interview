package com.interview;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/12 23:17
 */
public class TestInnerClass {
    public static void main(String[] args) {
        StaticInnerClass.test test = new StaticInnerClass.test();
        test.setId(101);
        System.out.println(test.id);
    }
}
