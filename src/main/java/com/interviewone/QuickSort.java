package com.interviewone;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/4/29 10:20
 */
public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {1,5,2,15,22,14,13,18,1845,1526,1554651,454};
        int high = arr.length;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,high-1);
        for (int value: arr
             ) {
            System.out.println(value);
        }
    }

    // 首先传入参数--数组--数组的开头和末尾--的数据
    void sort(int arr[],int low, int high) {
        // 两个指针
        if (low < high) {
            // 保存临时的值
            int tmp = arr[low];
            // 边界的临时的值是在递归边界
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
            // 被分隔开了两部分 实际用的是递归 直接结束
            sort(arr, left, low-1);
            //
            sort(arr, low + 1, right);
        }
    }

}
