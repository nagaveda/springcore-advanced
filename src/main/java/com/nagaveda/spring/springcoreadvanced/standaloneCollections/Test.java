package com.nagaveda.spring.springcoreadvanced.standaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springcoreadvanced/standaloneCollections/config.xml");
        ProductsList productsList = (ProductsList) context.getBean("productsList");
        System.out.println(productsList);
    }
}
