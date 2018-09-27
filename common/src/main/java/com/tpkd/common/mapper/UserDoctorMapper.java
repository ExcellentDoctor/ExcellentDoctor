package com.tpkd.common.mapper;

import com.tpkd.common.pojo.UserDoctor;

public interface UserDoctorMapper {
    int insert(UserDoctor record);

    int insertSelective(UserDoctor record);

    int selectCount(Integer doctorId);

    UserDoctor selectById(UserDoctor userDoctor);

    int delete(UserDoctor userDoctor);
}