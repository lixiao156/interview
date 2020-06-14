package com.lock;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/4 11:44
 */
public class RushOrder {
   int i = 60000;
   public void order(){
       i--;
   }
   // 模拟高并发的
   public static void main(String[] args) {
       RushOrder rushOrder = new RushOrder();
       //使用6个线程进行处理
       for(int j = 0; j < 6;j++){
           new Thread(
                   ()->{

                   }
           ).start();
       }
   }
}
