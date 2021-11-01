package com.nagaveda.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBo {

    @Autowired
    @Qualifier("dao2")
    private OrderDAO dao;

    public OrderDAO getDao() {
        return dao;
    }

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }

    @Override
    public void placeOrder() {
        System.out.println("Inside place order of Order BO..");
        dao.createOrder();
    }

}
