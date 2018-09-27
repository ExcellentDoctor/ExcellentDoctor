package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.UserDoctorMapper;
import com.tpkd.common.pojo.UserDoctor;
import com.tpkd.common.services.RpcUserDoctorService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = RpcUserDoctorService.class)
public class UserDoctorServiceImpl implements RpcUserDoctorService {
    @Resource
    private UserDoctorMapper userDoctorMapper;
    @Override
    public UserDoctor selectById(UserDoctor userDoctor) {
       return userDoctorMapper.selectById(userDoctor);
    }

    @Override
    public int insertUserDoctor(UserDoctor userDoctor) {
        return userDoctorMapper.insert(userDoctor);
    }

    @Override
    public int deleteUserDoctor(UserDoctor userDoctor) {
        return userDoctorMapper.delete(userDoctor);
    }
}
