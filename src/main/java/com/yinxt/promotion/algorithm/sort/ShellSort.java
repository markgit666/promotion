package com.yinxt.promotion.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-03-19 23:42
 */
@Slf4j
public class ShellSort {

    public static void main(String[] args) {
        int[] array = RandomArray.getRandomArray(20);
        shellSort(array);
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
