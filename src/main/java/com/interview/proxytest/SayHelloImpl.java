package com.interview.proxytest;

import static java.lang.System.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 17:37
 */
public class SayHelloImpl implements SayHello {

    @Override
    public void say(String name) {
        out.println(name);
    }

    @Override
    public void print(int id) {
        out.println(id);
    }
}
