package com.nagaveda.spring.springcoreadvanced.autowiring.annotations.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
    private String name;
    private Reservation reservation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reservation getReservation() {
        return reservation;
    }

    @Autowired
    @Qualifier("reservation1")
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", reservation=" + reservation + "]";
    }

}
