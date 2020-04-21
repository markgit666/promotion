package com.yinxt.promotion;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-03-11 23:45
 */
public class StringTest {

    public static void main(String[] args) {

        char c = '中';//必须单引号
        char d = 65535;//Java中char为两个字节0-655355，超过范围必须要强制类型转换
        //char dd = -1;//编译不通过
        System.out.println("d=" + d);

        //强制类型转换，并且溢出
        byte b = (byte) -129;
        System.out.println("b=" + b);

        //强制类型转换，并且溢出
        int ii = (int) 3.14;
        float f = 4;//可以加f/F，可以不加

        //强制类型转换
        char cd = (char) (c + d);

        c += d;//编译通过

        char k = 3 + 9;//编译通过

        System.out.println("\\");
        String str = "abc";
        str.toString();
        str.toCharArray();

        StringTest test = new StringTest();
        List<String> list = new ArrayList();
        list.forEach(StringTest::fun);
        //1
        for (String s : list) {
            StringTest.fun(s);
        }
        //2
        list.forEach(x -> StringTest.fun(x));
        //3
        Consumer<String> consumer = StringTest::fun;
        list.forEach(a -> consumer.accept(a));
        //4
        list.forEach(StringTest::fun);

        if (list instanceof StringUtils) {
            System.out.println("可以转型");
        } else {
            System.out.println("不能转型");
        }

        Integer i = 0;
        if (i instanceof Integer) {
            System.out.println("可以转型");
        }
        int[] ca = {};

        //hashTable hashMap
        Dictionary hashTable = new Hashtable();
        Map hashMap = new HashMap();
        hashMap.put("a", "a");
        hashTable.put("b", "b");
        Enumeration enumeration = hashTable.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        System.out.println(enumeration);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("c", "c");

        System.out.println(Integer.class == Integer.TYPE);
    }

    public static void fun(String a) {
    }

}
