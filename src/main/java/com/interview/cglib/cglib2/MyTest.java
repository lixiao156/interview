package com.interview.cglib.cglib2;

import com.interview.JSONUtil;
import org.w3c.dom.ls.LSOutput;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/14 12:51
 */
public class MyTest {
    public static void main(String[] args) {

        SellService target = new SellService();
        SellService sevice = new CglibFactory(target).myCglibSell();
        String result = sevice.buy();
        System.out.println(result);
        String sell = sevice.sell();
        System.out.println(sell);

    }
}
