package com.learn.bean_lifecycle_tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    User user;

    @GetMapping("/user")
    public void invoke(){
        user.demoUser();
    }
}
