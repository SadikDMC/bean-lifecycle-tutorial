package com.learn.bean_lifecycle_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {


    public Order(){
        System.out.println("Lazy: Intializing order");
    }
}
