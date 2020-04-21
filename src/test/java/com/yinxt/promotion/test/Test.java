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

    public static Test t1 = new Test();

    public static void main(String[] args) {

        Test t2 = new Test();
    }

    @org.junit.Test
    public void testVarial() {
        int i = 8;
        int j = i++;
        log.info("j={}", j);
        Scanner scanner = new Scanner(System.in);

        Map<String, String>  hashMap = new HashMap<>();
    }
}
