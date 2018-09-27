package com.tpkd.consumer.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.UserDoctor;

public interface UserDoctorService {
    Dto selectUserAndDoctor(UserDoctor userDoctor);

    Dto insertOrDeleteFocus(UserDoctor userDoctor);
}
