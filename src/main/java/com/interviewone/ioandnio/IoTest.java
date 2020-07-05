package com.interviewone.ioandnio;

import java.io.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/5 14:25
 */
public class IoTest {
    public static void main(String[] args) {


    }
    public static void outputStream() throws IOException {
        //创建一个File实例
        File file = new File("/home/wenhaibo/IOTest.txt");
        //FileOutputStream为文件输出流
        FileOutputStream out = new FileOutputStream(file);
        //将内容转换为字节码输出
        out.write("This is IOTest".getBytes());
        //强制输出内存中所有内容
        out.flush();
        //关闭输出流
        out.close();
    }
    //输入流
    public static void inputStream() throws IOException{
        //创建一个File实例
        File file = new File("C:\\Users\\Administrator\\Desktop\\shiro的实现权限管理的流程1.txt");
        //FileInputStream为文件输入流
        FileInputStream in = new FileInputStream(file);
        byte[] b = new byte[1024];
        //将 byte.length 个字节的数据读入一个 byte 数组中
        int len =in.read(b);
        //将字节码转为字符串打印输出
        System.out.println(new String(b, 0, len));
        //关闭输入流
        in.close();
    }

    //字符流
    public static void outputStreamWriter() throws IOException{
        //创建一个File实例
        File file = new File("/home/wenhaibo/IOTest.txt");
        //FileWriter为文件输出流
        Writer out = new FileWriter(file);
        //直接输出字符
        out.write("This is IOTest");
        //强制输出内存中所有内容
        out.flush();
        //关闭输出流
        out.close();
    }

    public static void inputStreamReader() throws IOException{
        //创建一个File实例
        File file = new File("C:\\Users\\Administrator\\Desktop\\shiro的实现权限管理的流程1.txt");
        //Reader为文件输入流
        Reader in=new FileReader(file);
        char[] c=new char[1024];
        //将 byte.length 个字节的数据读入一个 byte 数组中
        int len =in.read(c);
        //将字节码转为字符串打印输出
        System.out.println(new String(c, 0, len));
        //关闭输入流
        in.close();

    }

}