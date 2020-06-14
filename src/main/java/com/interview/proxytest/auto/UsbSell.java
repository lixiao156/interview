package com.interview.proxytest.auto;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 20:46
 */
// 目标接口
public interface UsbSell {

    float sell(int amount);

    float buy(int amount);
    void print();
}
