package com.nagaveda.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private Address address;

    // Constructor

    // public Employee(Address address) {
    // this.address = address;
    // }

    // Getters and Setters

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address123")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }

}
