package com.yinxt.promotion.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-05-01 19:25
 */
@Slf4j
public class CollectionTest {

    public CollectionTest() {
        log.info("construct method");
    }

    {
        log.info("ordinary code");
    }

    static {
        log.info("static code");
    }


    public static void main(String[] args) {
        CollectionTest collectionTest = new CollectionTest();

        List<String> arrayList = new ArrayList<>();
        arrayList.add("yxt");

        Map<String, String> map = new HashMap<>();
        map.put("name", "yinxt");
    }
}
