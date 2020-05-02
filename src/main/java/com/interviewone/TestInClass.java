package com.interviewone;

import java.util.Vector;

/**
 * 内部类
 *
 * @author helloLi
 * @version 1.0
 * @date 2020/4/28 22:11
 */
public class TestInClass {
    public static void main(String[] args) {
        InOrOurClass inOrOurClass = new InOrOurClass();
        System.out.println(inOrOurClass.getId());;
        InOrOurClass.inClass inClass = inOrOurClass.new inClass();
        System.out.println(inClass.getValue());
        InOrOurClass.StaticInClass staticInClass = new InOrOurClass.StaticInClass();
        Vector V = new Vector();


    }
}
