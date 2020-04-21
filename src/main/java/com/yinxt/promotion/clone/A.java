package com.yinxt.promotion.clone;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-04-18 20:23
 */
@Data
public class A implements Serializable {
    private String name;
    private B b;

    public A() {

    }
}
