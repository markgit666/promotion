package com.yinxt.promotion.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {

    public static void main(String[] args) {
        //初始化一个随机数组
        int[] intArray = RandomArray.getRandomArray(20);
        //插入排序
        bubbleSort(intArray);
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

}
