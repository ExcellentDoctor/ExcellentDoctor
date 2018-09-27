package com.tpkd.consumer.services.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.UserDoctor;
import com.tpkd.common.services.RpcUserDoctorService;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.util.EmptyUtil;
import com.tpkd.consumer.services.UserDoctorService;
import org.springframework.stereotype.Service;

@Service
public class UserDoctorServiceImpl implements UserDoctorService {
    @Reference
    private RpcUserDoctorService rpcUserDoctorService;
    @Override
    public Dto selectUserAndDoctor(UserDoctor userDoctor) {
        UserDoctor userDoctor1=rpcUserDoctorService.selectById(userDoctor);
        if(EmptyUtil.isEmpty(userDoctor1)){
            return DtoUtil.getSuccess("可以关注");
        }else{
            return DtoUtil.getSuccess("已经关注");
        }
    }

    @Override
    public Dto insertOrDeleteFocus(UserDoctor userDoctor) {
        UserDoctor userDoctor1=rpcUserDoctorService.selectById(userDoctor);
        if(EmptyUtil.isEmpty(userDoctor1)) {
            rpcUserDoctorService.insertUserDoctor(userDoctor);
            return DtoUtil.getSuccess("关注成功");
        }else{
            rpcUserDoctorService.deleteUserDoctor(userDoctor);
            return DtoUtil.getSuccess("成功取消关注");
        }
    }
}
