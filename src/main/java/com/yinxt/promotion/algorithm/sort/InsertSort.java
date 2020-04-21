package com.yinxt.promotion.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-03-19 23:40
 */
@Slf4j
public class InsertSort {

    public static void main(String[] args) {
        int[] array = RandomArray.getRandomArray(20);
        insertionSort(array);
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
}
