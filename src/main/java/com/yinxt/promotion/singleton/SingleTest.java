package com.yinxt.promotion.singleton;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020/5/31 14:39
 */
@Slf4j
public class SingleTest {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            SingletonUser singletonUser = SingletonUser.getInstance();
            log.info("对象={}", singletonUser);
        }
    }
}
