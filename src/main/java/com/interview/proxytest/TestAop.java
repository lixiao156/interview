package com.interview.proxytest;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 17:40
 *
 * 测试jdk中的反射机制(mothod代表目标方法)
 * 使用mothod方法（代表目标方法）进行调用invoke方法进行调用任意对象的的目标方法
 */
public class TestAop {
    public static void main(String[] args) throws Exception {
        // 通过反射机制执行sayhello方法 ，核心是mothod方法
        SayHello target = new SayHelloImpl();
        // 获取sayhello名称对于mothod的类的对象
        Method method = SayHello.class.getMethod("say", String.class);
        Method mothod2 = SayHello.class.getMethod("print",int.class);
        // 通过mothod可以执行sayhello方法调用
        //invoke是moethod类中的一个方法，表示执行调用 Oject表示对象的方法 Object...args 表示执行时候的参数
        SayHello target2 = new SayHelloImpl();
        Object lisi = method.invoke(target, "lisi");
        Object lisi2 = method.invoke(target2, "wangwu");
        mothod2.invoke(target, 1);

//        Proxy proxy = new Proxy();

    }
}
