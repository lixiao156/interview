package com.interviewone;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/29 10:20
 */
public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {1,5,2};
        int high = arr.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,high-1);
        for (int value: arr
             ) {
            System.out.println(value);
        }
    }

    void sort(int arr[],int low,int high) {
        if (low < high) {
            int tmp = arr[low];
            int mid;
            int left = low;
            int right = high;

            while (low < high) {

                while (low < high && arr[high] >= tmp) {
                    high--;
                }
                // 如果队尾元素小于tmp了,需要将其赋值给low
                arr[low] = arr[high];
                // 当队首元素小于等于tmp时,向前挪动low指针
                while (low < high && arr[low] <= tmp) {
                    low++;
                }
                // 当队首元素大于tmp时,需要将其赋值给high
                arr[high] = arr[low];
            }
            arr[low] = tmp;

            sort(arr, low, low-1);
            sort(arr, low + 1, right);
        }
    }

}
