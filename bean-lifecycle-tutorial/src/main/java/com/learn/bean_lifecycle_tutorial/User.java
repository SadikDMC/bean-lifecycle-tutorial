package com.learn.bean_lifecycle_tutorial;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    Order order;

    public User(){
        System.out.println("Initializing user Object");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Beans have been initialized and dependencies have been injected");
    }

    public void demoUser() {
        System.out.println("Invoking the user method");
    }
    @PreDestroy
    public void predestroy(){
        System.out.println("Bean is about to destroy, in predestroy method");
    }

}
