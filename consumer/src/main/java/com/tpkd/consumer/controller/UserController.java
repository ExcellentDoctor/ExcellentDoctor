package com.tpkd.consumer.controller;


import com.tpkd.common.pojo.User;
import com.tpkd.consumer.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/say")
    public User say(){
        return userService.selectById(1);
    }
}
