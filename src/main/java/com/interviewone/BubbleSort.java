package com.interviewone;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/29 10:12
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1,2,5,3,8,28,2,7};
        BubbleSort quickSort = new BubbleSort();
        quickSort.sort(a);
        for (int value:a
             ) {
            System.out.println(value);
        }
    }

    void sort(int arr[]){
        int tmp;
        int i = arr.length;
        for(int j = 0;j < i;j++){
            for(int m = j+1;m < i; m++){
                if(arr[j] > arr[m]){
                    tmp = arr[j];
                    arr[j] = arr[m];
                    arr[m] = tmp;
                }
            }
        }
    }
}
