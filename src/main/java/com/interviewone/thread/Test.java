package com.interviewone.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
// 使用多线程的方式处理大型文件
public class Test {
    // 文章的文件名
    public void countWordsOfArticle(String fileName, int arraySize) throws IOException {
        // 创建文件对象
        File file = new File(fileName);
        // 对象不能创建吗？
        if (!file.exists()) {
            System.out.println("该文件不存在");
            return;
        }
        MappedBiggerFileReader reader = new MappedBiggerFileReader(fileName, arraySize);
        while (reader.read() != -1) {
            wordCount(reader);
        }
    }

    private static void wordCount(MappedBiggerFileReader reader) throws IOException {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(reader));
        StringBuffer buffer = new StringBuffer();
        String line = " ";
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        String request = buffer.toString();

        Pattern p = Pattern.compile("[, . ; ! ? ]");
        Matcher m = p.matcher(request);
        String[] strs = p.split(request);
        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(strs[i].toLowerCase())) {
                map.put(strs[i].toLowerCase(), map.get(strs[i].toLowerCase()) + 1);
            } else {
                map.put(strs[i].toLowerCase(), 1);
            }
        }
        List<Map.Entry<String, Integer>> result = map.entrySet().stream()
                .sorted(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                }).collect(Collectors.toList());
        result.forEach(item -> {
            System.out.println(item.getKey() + " " + item.getValue());
        });
    }
    // 继承方法 输入流
    public class MappedBiggerFileReader extends InputStream{
        // 将文件映射到内存
        private MappedByteBuffer[] mappedBufArray;
        // 统计值吗
        private int count = 0;
        private int number;
        // 文件输入流
        private FileInputStream fileIn;
        // 文件长度
        private long fileLength;
        // 数组的大小
        private int arraySize;
        // 定义数组
        private byte[] array;

        public MappedBiggerFileReader(String fileName, int arraySize) throws IOException {
            // 指的是成员变量
            this.fileIn = new FileInputStream(fileName);
            // 获取输入流的位置
            FileChannel fileChannel = fileIn.getChannel();
            // 获取通道的大小（输入流的字节数）
            this.fileLength = fileChannel.size();
            //
            this.number = (int) Math.ceil((double) fileLength / (double) Integer.MAX_VALUE);
            this.mappedBufArray = new MappedByteBuffer[number];// 内存文件映射数组
            long preLength = 0;
            long regionSize = (long) Integer.MAX_VALUE;// 映射区域的大小
            for (int i = 0; i < number; i++) {// 将文件的连续区域映射到内存文件映射数组中
                if (fileLength - preLength < (long) Integer.MAX_VALUE) {
                    regionSize = fileLength - preLength;// 最后一片区域的大小
                }
                mappedBufArray[i] = fileChannel.map(FileChannel.MapMode.READ_ONLY, preLength, regionSize);
                preLength += regionSize;// 下一片区域的开始
            }
            this.arraySize = arraySize;
        }

        public int read() throws IOException {
            if (count >= number) {
                return -1;
            }
            int limit = mappedBufArray[count].limit();
            int position = mappedBufArray[count].position();
            if (limit - position > arraySize) {
                array = new byte[arraySize];
                mappedBufArray[count].get(array);
                return arraySize;
            } else {// 本内存文件映射最后一次读取数据
                array = new byte[limit - position];
                mappedBufArray[count].get(array);
                if (count < number) {
                    count++;// 转换到下一个内存文件映射
                }
                return limit - position;
            }
        }

        public void close() throws IOException {
            fileIn.close();
            array = null;
        }

        public byte[] getArray() {
            return array;
        }

        public long getFileLength() {
            return fileLength;
        }
    }
}