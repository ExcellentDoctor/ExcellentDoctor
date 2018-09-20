package com.tpkd.consumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.pojo.User;
import com.tpkd.common.services.RpcUserServices;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Reference
    private RpcUserServices rpcUserServices;
    @Override
    public User selectById(int id) {
        return rpcUserServices.selectById(id);
    }
}
