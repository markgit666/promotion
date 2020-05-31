package com.yinxt.promotion.singleton;

/**
 * 枚举单例
 *
 * @author yinxt
 * @version 1.0
 * @date 2020-04-18 17:36
 */
public class SingletonUser {

    private String name;
    private String age;

    private SingletonUser() {

    }

    private enum SingletonEnum {

        INSTANCE;

        private SingletonUser singletonUser;

        SingletonEnum() {
            singletonUser = new SingletonUser();
        }

        public SingletonUser getSingletonUser() {
            return singletonUser;
        }
    }

    public static SingletonUser getInstance() {
        return SingletonEnum.INSTANCE.getSingletonUser();
    }

}
