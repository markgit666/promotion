package com.yinxt.promotion.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Slf4j
@SpringBootTest
public class Test {

    private String name;

    static {
        System.out.println("blockB");
    }

    {
        System.out.println("blockA");
    }

//    public static Test t1 = new Test();

    public Test() {
        log.info("执行构造方法");
    }

    public static void main(String[] args) {

//        Test t2 = new Test();
        testVarial();
    }

    //    @org.junit.Test
    public static void testVarial() {
        int i = 8;
        int j = i++;
        log.info("j={}", j);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        log.info("输入字符：{}", str);

//        String str2 = scanner.next();
//        log.info("str2={}", str2);

        String s = scanner.findInLine("sfsf");
        log.info("find={}", s);

        boolean b = scanner.hasNext();
        log.info("b = {}", b);

        while (!scanner.hasNext("#")) {
            String next = scanner.next();
            log.info("str={}", next);
        }
        log.info("end code!");


        Map<String, String> hashMap = new HashMap<>();
    }
}
