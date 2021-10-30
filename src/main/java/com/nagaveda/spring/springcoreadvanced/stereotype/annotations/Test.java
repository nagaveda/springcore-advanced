package com.nagaveda.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springcoreadvanced/stereotype/annotations/config.xml");
        Instructor instructor = (Instructor) context.getBean("inst");
        System.out.println(instructor);

        // Instructor instructor1 = (Instructor) context.getBean("inst");
        // System.out.println(instructor1.hashCode());
    }
}
