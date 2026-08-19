package com.learn.bean_lifecycle_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;

    public User(){
        System.out.println("Initializing user Object");
    }
}
