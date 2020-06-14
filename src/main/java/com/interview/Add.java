package com.interview;

import java.util.jar.JarOutputStream;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/18 13:22
 */
public class Add {

    public static void main(String[] args) {
        int sum = 0;

        Add addObj = new Add();
      sum =  addObj.add(0,1);
        System.out.println(sum);
    }

    int add (int sum, int num){
        if(num > 50){
            return sum;
        }
        sum = sum + num;
       return add(sum,++num);
    }
}
