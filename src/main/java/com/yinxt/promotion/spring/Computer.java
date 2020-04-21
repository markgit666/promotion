package com.yinxt.promotion.spring;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-04-18 21:08
 */
@Data
@Slf4j
public class Computer {
    private String name;
    private double price;
    private CPU cpu;

    public void cal() {
        log.info("我是一台计算机，我叫{}，开始工作啦。。。", name);
    }
}
