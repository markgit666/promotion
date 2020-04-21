package com.yinxt.promotion.algorithm.sort;

import java.util.Random;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-03-19 23:41
 */
public class RandomArray {

    /**
     * 获取一个随机数组
     *
     * @return
     */
    public static int[] getRandomArray(int count) {
        Random random = new Random();
        int[] intArray = new int[count];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

}
