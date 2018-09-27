package com.tpkd.common.vo.doctor;

import java.io.Serializable;

public class DoctorPayVo implements Serializable {
    private String serviceName;
    private String price;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
