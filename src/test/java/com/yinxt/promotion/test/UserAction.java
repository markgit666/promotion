package com.yinxt.promotion.test;

public interface UserAction {

    public final String userName = "";

    default void test(){
        System.out.println("这是一个接口中的default方法");
    }

    public abstract void test1();
}
