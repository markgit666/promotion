package com.yinxt.promotion;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-02-29 17:35
 */
public abstract interface InterTest {

    public static final String a = "";
    int i = 0;

    default void tt() {
//        primethod();
    }

    public abstract void dd();

    static void ee() {

    }

    //java9中支持 接口私有方法
   /* private void primethod() {
        System.out.println("接口私有方法");
    }*/
}
