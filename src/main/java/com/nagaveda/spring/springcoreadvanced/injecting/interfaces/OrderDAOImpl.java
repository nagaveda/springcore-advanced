package com.nagaveda.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {

    @Override
    public void createOrder() {
        System.out.println("Inside create order... of Order DAO");
    }

}
