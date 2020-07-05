package com.interview.cglib.cglib2;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/14 11:56
 *
 * 基于cglib的代理，需要自己手工创建工厂
 */
// 目标类的方法，是没有实现接口
public class SellService {
    public String sell(){
        System.out.println("卖东西方法");
        return "helloWorld";
    }

    public String buy(){
        System.out.println("买东西方法");
        return "32块";
    }
}
