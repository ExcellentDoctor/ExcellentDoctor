package com.tpkd.common.services;


import com.tpkd.common.pojo.UserDoctor;

public interface RpcUserDoctorService {
    UserDoctor selectById(UserDoctor userDoctor);

    int insertUserDoctor(UserDoctor userDoctor);

    int deleteUserDoctor(UserDoctor userDoctor);
}
