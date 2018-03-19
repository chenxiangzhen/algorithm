package com.cxz.sort;

/**
 * Created by chenx on 2018/3/19.
 */
public class SortTest {

    /**
     * 冒泡排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j -1];
                    array[j -1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int flag = i;
            for (int j = i +1; j < array.length; j++) {
                if (array[j] < array[flag]) {
                    flag = j;
                }
            }
            if (flag != i) {
                int tmep = array[i];
                array[i] = array[flag];
                array[flag] = tmep;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {5,4,9,8,7,6,0,1,2,3};
        //bubbleSort(a);
        selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
