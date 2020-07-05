package com.interviewone.ioandnio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/5 14:28
 */
public class NioTest {

    public static void main(String[] args) throws IOException {
        inputNIOChannel();
//        test01();
    }
    public static void inputNIOChannel() throws IOException {
        Charset charset = Charset.forName("UTF-8");
        //创建一个File实例
        File file = new File("C:\\Users\\Administrator\\Desktop\\shiro的实现权限管理的流程1.txt");
        //FileInputStream为文件输入流
        FileInputStream in = new FileInputStream(file);
        //缓冲器向通道输入数据
        FileChannel fileChannel = in.getChannel();

        //创建一个容量为1024字节的ByteBuffer
        ByteBuffer buf = ByteBuffer.allocate(2048);
        //写入数据到Buffer
        int bytesRead = fileChannel.read(buf);
        while(bytesRead != -1)
        {
            //回绕缓冲区（输出通道会从数据的开头而不是末尾开始）
            buf.flip();
            Charset charset1 = Charset.forName("UTF-8");

            while(buf.hasRemaining())
            {
//                System.out.print((char)buf.get());
                CharBuffer charBuffer1 = charset1.decode(buf);
                System.out.println(charBuffer1.toString());
            }
            /**
             * 压缩此缓冲区，compact方法会执行两个动作
             * 1.清除之前写好的字符
             * 2.通过标记位置为0
             * 这就为什么要结合filp()使用
             */
            buf.compact();
            //写入数据到Buffer
            bytesRead = fileChannel.read(buf);
        }
    }

    public static void test01(){
        Map<String, Charset> charsetMap = Charset.availableCharsets();
        Set<Map.Entry<String,Charset>> set = charsetMap.entrySet();
        for(Map.Entry<String,Charset> entry:set){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

}
