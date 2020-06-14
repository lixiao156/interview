package com.interview.proxytest.auto;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 20:48
 */
// 必须实现invocationHandler接口，完成代理类的功能（调用目标方法，功能增强）
public class MySellHandler implements InvocationHandler {

    private Object target = null;
    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 参考静态的代理类的
        Object res = null;
        // 动态的说明不固定，需要传入目标对象
        res = method.invoke(target,args);//执行目标方法
        //功能增强
        if(res != null){
            Float price = (Float)res;
            price = price + 25;
            res = price;
        }
        System.out.println("动态代理增强");
        return res;
    }
}
