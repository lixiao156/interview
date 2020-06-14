package com.interview.proxytest.auto;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 20:56
 */
public class MainShop {
    public static void main(String[] args) {
        // 创建目标对象
        UsbSell factory = new UsbKingFactory();
        // 创建invocationHandler对象
        InvocationHandler invocationHandler = new MySellHandler(factory);
        // 创建代理对象 不像静态的代理类的对象 事先知道目标调用方法名与参数
        UsbSell proxyInstance = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(), invocationHandler);
        // 通过动态代理执行目标方法--------底层实现的是invokeHandler对象中的invoker方法。
        float price = proxyInstance.buy(1);
        float buy = proxyInstance.sell(1);
        System.out.println("通过动态代理对象，调用："+ price+" / "+ buy);
    }
}
