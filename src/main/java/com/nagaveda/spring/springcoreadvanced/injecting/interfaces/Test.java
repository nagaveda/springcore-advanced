package com.nagaveda.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springcoreadvanced/injecting/interfaces/config_annotations.xml");
        OrderBo bo = (OrderBo) context.getBean("bo");
        bo.placeOrder();
    }
}
