package com.jd.arithmetic;

/**
 * Created by lichunran on 2018/2/1.
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] a = {10,8,93,56,42,78,2,110,36,87,36,200};
        selectSortOptimize(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void selectSortOptimize(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[minIndex] > a[j])
                    minIndex = j;
            }
            if(a[minIndex] != a[i]) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
    }

    private static void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void methodArgTest(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = 0;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("test方法内：" + b[i]);
        }
    }



}
