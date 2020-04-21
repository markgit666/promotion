package com.yinxt.promotion.algorithm.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-03-22 00:03
 */
@Slf4j
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = RandomArray.getRandomArray(10);
        log.info("选择排序前的数组元素：{}", a);
        selectionSort(a);
        log.info("排序完成的数组元素：{}", a);
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
}
