package com.interview.proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 17:55
 */
public class JdkProcyTest {
    // 反射包 lang.reflect
    // 里面有三个类 invocationHandler ,Mothod,Proxy
    //1.invocationHandler 接口 就一个方法 invoke（） ：表示代理对象要执行的功能代码。你的代理类要完成的功能写在invoke（）方法中
    // 代理类功能：调用目标方法 与 功能增强
    public static void main(String[] args) {
//        InvocationHandler invocationHandler = new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        }
    }

}
