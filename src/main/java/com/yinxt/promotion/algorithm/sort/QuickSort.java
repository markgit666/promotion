package com.yinxt.promotion.algorithm.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * 快速排序
 *
 * @author yinxt
 * @version 1.0
 * @date 2020-03-20 23:25
 */
@Slf4j
public class QuickSort {

    public static void main(String[] args) {
        int[] array = RandomArray.getRandomArray(10);
        log.info("开始快速排序，原始数组：{}", array);
        quickSort(array, 0, array.length - 1);
        log.info("排序结束，得到数组：{}", array);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int i = left;
            int j = right;
            int x = array[i];
            //从右边寻找小于x的第一个元素
            while (i < j) {
                while (i < j && array[j] > x) {
                    j--;
                }
                if (i < j) {
                    array[i++] = array[j];
                }
                //从左边寻找大于x的第一个元素
                while (i < j && array[i] < x) {
                    i++;
                }
                if (i < j) {
                    array[j--] = array[i];
                }
            }
            array[i] = x;
            quickSort(array, left, i - 1);
            quickSort(array, i + 1, right);
        }
    }

}
