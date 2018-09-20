package com.tpkd.consumer.controller;

import com.tpkd.common.pojo.User;
import com.tpkd.consumer.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/show/{id}")
    public User sele(@PathVariable  int id){
        return userService.selectById(id);
    }

}
