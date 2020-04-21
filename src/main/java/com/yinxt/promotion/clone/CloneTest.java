package com.yinxt.promotion.clone;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.SerializationUtils;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-04-18 19:28
 */
@Slf4j
public class CloneTest {

    public static void main(String[] args) {
        testClone();
    }

    public static void testClone() {
        A a = new A();
        B b = new B();
        b.setName("我是B");
        b.setLength(2);
        b.setWidth(1);
        a.setName("我是A");
        a.setB(b);
        //克隆对象
        /**
         * 1、浅克隆
         * 直接调用对象的clone()方法
         * 2、深克隆
         * 几种方式：手动引用 递归克隆 结合序列化与反序列化和流的方式（推荐）
         * 常用的序列化工具：fastJson、commons-lang中的SerializationUtils.serialize()/clone()、spring util中的SerializationUtils.serialize()
         */
        //fastJson方式实现 目标对象不需要实现Serializable接口
        A fastJsonA = JSONObject.parseObject(JSONObject.toJSONString(a), A.class);
        a.getB().setName("我是更改后的B");
        log.info("fastJsonA={}", JSONObject.toJSONString(fastJsonA));
        //使用spring util工具类 目标对象需要实现Serializable接口
        byte[] serialize = SerializationUtils.serialize(a);
        A serializeA = (A) SerializationUtils.deserialize(serialize);
        log.info("serializeA={}", serializeA);
        //BeanUtils.copyProperties不能实现深克隆
        BeanUtils.copyProperties(a, serializeA);
        a.getB().setName("B我又改变了");
        log.info("serializeA={}", serializeA);
    }

}
