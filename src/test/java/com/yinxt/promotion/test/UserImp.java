package com.yinxt.promotion.test;

import org.junit.Test;

/**
 * 测试多态
 */
public class UserImp implements UserAction {

    private static String age;

    @Override
    public void test1() {

        System.out.println("UserImp中的test1方法");
    }

    public void test2() {
        System.out.println("UserImp中的test2方法");
        UserImp userImp = new UserImp();
            String a = userImp.age;
    }

    public static void test3(UserAction userAction) {
        System.out.println("UserImp中的test3方法");
        userAction.test1();
    }

    @Test
    public void name() {
    }

    public static void main(String args[]) {
        UserAction userAction = new UserImp();
        userAction.test();
        ((UserImp) userAction).test2();
        test3(userAction);

        /**
         * 测试idea快捷键
         */
        //代码提示
        test3(userAction);
        test3(userAction);
    }
}
