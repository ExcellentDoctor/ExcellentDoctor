package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.DoctorMapper;
import com.tpkd.common.pojo.Doctor;
import com.tpkd.common.services.RpcDoctorService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = RpcDoctorService.class)
public class DoctorServiceImpl implements RpcDoctorService {
@Resource
private DoctorMapper doctorMapper;
    @Override
    public Doctor selectDoctorMessage(Integer doctorId) {

        return null;
    }
}
