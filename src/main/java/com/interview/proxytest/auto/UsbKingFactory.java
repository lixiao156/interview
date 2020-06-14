package com.interview.proxytest.auto;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 20:47
 */
// 目标类
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中的目标方法");
        return 23;
    }

    @Override
    public float buy(int amount) {
        System.out.println("目标方法新增的购买方法");
        return 10;
    }

    @Override
    public void print() {
        //不影响代理类
    }
}
