package com.yinxt.promotion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-03-28 00:12
 */
@Slf4j
public class VolatileTest {

    private static /*volatile*/ int a;


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                synchronized (VolatileTest.class) {
                    a = a + 1;
                }
            }
        });

        Thread thread1 = new Thread() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < 5000; i++) {
//                    synchronized (VolatileTest.class) {
                    a = a + 1;
//                    }
                }
            }
        };
        thread.start();
        thread1.start();

        //main线程等待两个子线程运行完成
        thread.join();
        thread1.join();
        log.info("a={}", a);


    }
}
