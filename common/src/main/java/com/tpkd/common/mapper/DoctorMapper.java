package com.tpkd.common.mapper;

import com.tpkd.common.pojo.Doctor;

public interface DoctorMapper {
    Doctor selectDoctorById(int doctorId);
}
