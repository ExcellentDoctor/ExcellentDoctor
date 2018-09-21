package com.tpkd.consumer.controller;


import com.tpkd.common.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/say")
    public User say(){
        System.out.println("2333");
        return new User();
    }
}
