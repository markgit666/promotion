package com.yinxt.promotion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-02-29 21:43
 */
public class AddTest<E> extends ArrayList<String> implements InterTest {


    private String b;

    private static final String d;

    private final String c;

    private final String f = "f";

    private static String e;

    private E ee;

    public AddTest() {
        c = "c";
    }

    static {
        d = "d";
    }

    {
//        c = "c";
        b = "b";
    }

    public synchronized void printNum() {
        for (int t = 0; t < 10000; t++) {
            System.out.println("i = " + t);
        }
    }

    public synchronized void printNumJ() {
        int j = 0;
        while (j < 10000) {
            System.out.println("j=" + j);
            j++;
        }
    }

    public static void main(String[] args) {
        InterTest interTest = new AddTest();
//        interTest.printNum();//编译不通过

        AddTest<? extends Object> addTest1 = new AddTest();
        //addTest1.add(3);
        addTest1.add("s");
        //addTest1.add(2.003);

        AddTest<String> addTest2 = new AddTest<>();
        addTest1 = addTest2;
        System.out.println("addTest:" + addTest1);


//        System.out.println("unsafe=" + unsafe.getInt(23324525));
        List<Object> objects = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
//        objects = (List<Object>) stringList;//泛型赋值问题

        final byte b1 = 1;
        final byte b2 = 2;//添加final防止自动转型成int后编译出错
        byte b3 = b1 + b2;

        int i = 0;
        i = ++i;
        System.out.println("ii = " + i);

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        AddTest addTest = new AddTest();
        Thread threads = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("threads");
            addTest.printNumJ();
        }, "threads");
        threads.start();


        Thread thread1 = new Thread() {
            public void run() {
                System.out.println("thread1");
                addTest.printNum();
            }
        };
        thread1.start();

//        try {
//            System.out.println("开始睡眠");
//            threads.sleep(3000);
//            System.out.println("睡眠结束");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        FileTest test = new FileTest() {
            public void testSubstring() {
                System.out.println("fileTest");
                dd();
            }

            public void dd() {
                System.out.println("dd");
            }
        };

        test.testSubstring();

        new FileTest() {
            public void runs() {
                System.out.println("runs");
            }
        }.runs();

        synchronized (addTest.getClass()) {

        }

        try {
            threads.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        AddTest.<String>cc("d");

        addTest.cd("cd");
        System.out.println("运行结束");

    }

    @Override
    public void dd() {

    }

    public static <E> void cc(E e) {
        System.out.println("cc参数为：" + e);
    }

    public <E> void cd(E e) {
        System.out.println("cd参数为：" + e);
    }

    public void cf(AddTest<? extends Object> addTest) {

    }


    public class F {

    }
}
