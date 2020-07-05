package com.interview.cglib.cglib2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Method;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/14 12:00
 */
public class CglibFactory implements MethodInterceptor {

    private SellService target;

    public SellService myCglibSell(){
        // 增强
        Enhancer enhancer = new Enhancer();
        // 目标类设置为父类，基于cglib增强的特点：子类增强父类---指定目标类为父类
        enhancer.setSuperclass(SellService.class);
        //怎么增强--回头再调用，达到执行条件之后回头在调用,this表示当前的对象
        enhancer.setCallback(this);
        // create() 用于创建 cglib动态代理的对象
        return (SellService) enhancer.create();
    }

    public CglibFactory() {
    }

    public CglibFactory(SellService target) {
        this.target = target;
    }

    // 回调接口的方法:触发执行的条件--执行目标方法时候回触发该方法
    // 增强的原理是子类增强父类
    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(target, objects);
        if (invoke != null){
            invoke = ((String)invoke).toUpperCase();
        }
        System.out.println("增强");
        invoke = invoke+"得了";
        return invoke;
    }
}
