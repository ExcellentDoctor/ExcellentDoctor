package com.tpkd.consumer.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.vo.doctor.DoctorMessageVo;
import com.tpkd.common.vo.doctor.DoctorSelectVo;

public interface DoctorService {
    Dto selectDoctor(DoctorSelectVo doctorSelectVo);
    Dto selectDoctorMessage(Integer doctorId);
    Dto selectDoctorData(Integer doctorId);
}
