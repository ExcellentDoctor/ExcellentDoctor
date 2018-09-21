package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.UserMapper;
import com.tpkd.common.pojo.User;
import com.tpkd.common.services.RpcUserServices;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@Service(interfaceClass = RpcUserServices.class)
public class UserServiceImpl implements RpcUserServices {
    @Resource
    private UserMapper userMapper;
    @Override
    public User selectById(int id) {
       return  userMapper.selectByPrimaryKey(id);
    }
}
