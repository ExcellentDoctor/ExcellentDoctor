package com.tpkd.common.services;

import com.tpkd.common.pojo.Doctor;
import com.tpkd.common.vo.doctor.DoctorData;
import com.tpkd.common.vo.doctor.DoctorDetailedMessage;
import com.tpkd.common.vo.doctor.DoctorSelectVo;

public interface RpcDoctorService {
    DoctorDetailedMessage selectDoctorMessage(Integer doctorId);
    DoctorData selectDoctorData(Integer doctorId);
}
