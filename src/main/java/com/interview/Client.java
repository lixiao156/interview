package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/19 11:33
 */
public class Client {
    public static void main(String[] args) {
        String msg = "Client Date";
        try {
            Socket socket = new Socket("192.168.150.128",8089);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println(msg);
            pw.flush();
            String line = is.readLine();
            System.out.println(line);
            pw.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
