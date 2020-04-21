package com.yinxt.promotion.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yinxt
 * @version 1.0
 * @date 2020-04-18 21:17
 */
@Slf4j
public class StartIOC {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        Computer computer = applicationContext.getBean("computer", Computer.class);
        computer.cal();
    }

}
