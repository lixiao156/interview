package com.interviewone;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/4 9:09
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Comparator comparator = null;

        TreeMap treeMap = new TreeMap(comparator);
        treeMap.put(null,15);
        treeMap.put("13",13);
        treeMap.put("11",11);
        treeMap.put("18",18);

        treeMap.forEach((key, value) -> System.out.println(key + ":" + value));


// 假设map是TreeMap对象

// map中的key是String类型，value是Integer类型

        String key = null;

        Integer integ = null;

        Iterator iter = treeMap.keySet().iterator();
        System.out.println("ddd"+treeMap.keySet());
        while (iter.hasNext()) {

            // 获取key

            key = (String)iter.next();

            // 根据key，获取value

            integ = (Integer)treeMap.get(key);


            System.out.println(integ);
        }



    }
}
