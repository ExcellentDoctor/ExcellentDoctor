package com.tpkd.common.pojo;

import java.io.Serializable;

public class UserDoctor implements Serializable {
    private Integer userId;

    private Integer doctorId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}