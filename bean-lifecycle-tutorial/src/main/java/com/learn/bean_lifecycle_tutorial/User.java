package com.learn.bean_lifecycle_tutorial;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User(){
        System.out.println("Initializing user Object");
    }
}
