package com.interview;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/19 11:51
 */
public class NIOServer {
    public static void main(String[] args) {
        try {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            ssc.socket().bind(new InetSocketAddress(8080));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
