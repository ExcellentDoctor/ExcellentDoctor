package com.tpkd.common.services;

import com.tpkd.common.pojo.Doctor;
import com.tpkd.common.vo.doctor.DoctorSelectVo;

public interface RpcDoctorService {
    Doctor selectDoctorMessage(Integer doctorId);
}
