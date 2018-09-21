package com.tpkd.consumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.pojo.User;
import com.tpkd.common.services.RpcUserServices;
import com.tpkd.common.util.RedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Reference
    private RpcUserServices rpcUserServices;


    @Resource
    private RedisUtil redisUtil;

    @Override
    public User selectById(int id) {

        redisUtil.setForever("user:"+id,rpcUserServices.selectById(id));
        return rpcUserServices.selectById(id);
    }
}
