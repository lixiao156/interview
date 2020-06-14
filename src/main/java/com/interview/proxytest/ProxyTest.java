package com.interview.proxytest;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 17:34
 */
public class ProxyTest {
    // 使用常见 非反射的机制来执行目标类中的方法
    public static void main(String[] args) {
        SayHello sayHello = new SayHelloImpl();
        sayHello.say("jjj");

        SayHello sayHello1 = new SayHelloImpl();
        sayHello.say("jjdh");
    }

}
