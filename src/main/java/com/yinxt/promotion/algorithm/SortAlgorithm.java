package com.yinxt.promotion.algorithm;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Random;

@Slf4j
public class SortAlgorithm {

    public static void main(String[] args) {
        //初始化一个随机数组
        int[] intArray = getRandomArray();
        //插入排序
//        insertionSort(intArray);

//        bubbleSort(intArray);
        //希尔排序
        shellSort(intArray);

    }


    private static int[] getRandomArray() {
        Random random = new Random();
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

    /**
     * 插入排序
     *
     * @param dataArray
     */
    private static void insertionSort(int[] dataArray) {
        log.info("开始进行插入排序：原始数组：{}", JSON.toJSONString(dataArray));
        long startTime = new Date().getTime();
        int compareCount = 0;
        for (int i = 1; i < dataArray.length; i++) {
            int j = i;
            int temp = dataArray[j];
            while (j > 0 && temp < dataArray[j - 1]) {
                dataArray[j] = dataArray[j - 1];
                j--;
                compareCount++;
            }
            dataArray[j] = temp;
        }
        log.info("排序结束，得到数组：{}", JSON.toJSONString(dataArray));
        long endTime = new Date().getTime();
        log.info("共比较了{}次，排序耗时：{}毫秒", compareCount, endTime - startTime);
    }

    /**
     * 冒泡排序
     *
     * @param dataArray
     */
    private static void bubbleSort(int[] dataArray) {
        log.info("冒泡排序算法开始，初始数组：{}", JSON.toJSONString(dataArray));
        for (int i = dataArray.length - 1; i >= 1; i--) {
            boolean sortFlag = false;
            for (int j = 0; j <= i - 1; j++) {
                if (dataArray[j] > dataArray[j + 1]) {
                    int temp = dataArray[j + 1];
                    dataArray[j + 1] = dataArray[j];
                    dataArray[j] = temp;
                    sortFlag = true;
                }
            }
            if (!sortFlag) {
                log.info("排序提前结束：i = {}", i);
                break;
            }
        }
        log.info("冒泡排序算法结束，得到排序结果：{}", JSON.toJSONString(dataArray));
    }

    /**
     * 希尔排序
     *
     * @param dataArray
     */
    private static void shellSort(int[] dataArray) {
        log.info("开始希尔排序，初始数组：{}", JSON.toJSONString(dataArray));
        int j;
        for (int gap = dataArray.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < dataArray.length; i++) {
                int temp = dataArray[i];
                for (j = i; j >= gap && dataArray[j] < dataArray[j - gap]; j = j - gap) {
                    dataArray[j] = dataArray[j - gap];
                }
                dataArray[j] = temp;
            }

        }
        log.info("希尔排序结束，得到数组：{}", JSON.toJSONString(dataArray));
    }

}