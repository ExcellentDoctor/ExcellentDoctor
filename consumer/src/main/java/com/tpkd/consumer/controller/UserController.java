package com.tpkd.consumer.controller;


import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.User;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.util.EmptyUtil;
import com.tpkd.common.util.MD5Utils;
import com.tpkd.common.util.RedisUtil;
import com.tpkd.common.vo.user.RegisterVo;
import com.tpkd.consumer.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Dto addUser(RegisterVo registerVo){
        registerVo.setPassword(MD5Utils.getMD5(registerVo.getPassword(),20));

        String activeCode = (String) redisUtil.get("active:"+registerVo.getPhoneNumber());

        if (!EmptyUtil.isEmpty(activeCode) && registerVo.getActiveCode().equals(activeCode)){
            if (userService.addUser(registerVo)){
                return DtoUtil.getSuccess("注册成功!");
            }else {
                return DtoUtil.getFailed("注册失败！","1001");
            }
        }
        return DtoUtil.getSuccess();
    }



    @RequestMapping(value = "/sendActiveCode",method = RequestMethod.POST)
    public Dto sendMsg(String phoneNum) {
        userService.SendPhoneMsg(phoneNum);
        return DtoUtil.getSuccess("短信发送成功，请在30分钟内填写。");
    }



}
