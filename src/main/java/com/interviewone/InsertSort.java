package com.interviewone;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/5 10:59
 */
public class InsertSort {
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int a[] = {1,5,6,8,52,47,1,5,1,5,54};
        insertSort.sort(a);
        for (int s:a
             ) {
            System.out.println(s);
        }
    }

    public static int[] sort(int[] ins){

        for(int i = 1; i < ins.length; i++){

            for(int j = i; j > 0; j--){
                // 直接插入排序
                if(ins[j] < ins[j-1]){
                    int temp = ins[j-1];
                    ins[j-1] = ins[j];
                    ins[j] = temp;
                }
            }
        }
        return ins;
    }

}
