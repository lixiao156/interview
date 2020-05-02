//package com.interviewone.thread;
//
//import org.apache.coyote.InputBuffer;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
///**
// * @author helloLi
// * @version 1.0
// * @date 2020/4/30 15:02
// */
//public class TestThread {
//
//    Thread t1 = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            try {
//                mapTask(1,100,"E:\\");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//    });
//
//}
//public static void mapTask(int StartNum,int EndNum,String path) throws IOException {
//    Map<String,Integer> map = new HashMap<>();
//    LineNumberReader lr = new LineNumberReader(new FileReader(new File(path)));
//    String line = null;
//    while ((line = lr.readLine())!=null){
//        int num = lr.getLineNumber();
//        if(num >= StartNum && num <= EndNum){
//            String [] words = line.split("\\s");
//            for(String word:words){
//                Integer n = map.getOrDefault(word,0);
//                n++;
//                map.put(word,n);
//            }
//        }
//    }
//
////    BufferedReader bw = new BufferedReader(new OutputStreamWriter(
////            new FileOutputStream(new File("E:\\"),true)));
////    Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
////    for(Map.Entry<String,Integer>entry:entrySet){
////        bw.write(entry.toString());
////        bw.newLine();
////    }
////    bw.flush();
////    bw.close();
////    lr.close();
////
////}
//
//public static void reduceTask(String path) throws Exception {
//    Map<String, Integer> map = new HashMap<>();
//    BufferedReader br = new BufferedReader(new FileReader(path));
//    String line = null;
//    while ((line = br.readLine()) != null) {
//        String[] words = line.split("=");
//        Integer count = map.getOrDefault(words[0], 0);
//        count += Integer.parseInt(words[1]);
//        map.put(words[0], count);
//    }
//    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//    for (Map.Entry<String, Integer> entry : entrySet) {
//        System.out.println(entry);
//    }
//    br.close();
//  }
//}
