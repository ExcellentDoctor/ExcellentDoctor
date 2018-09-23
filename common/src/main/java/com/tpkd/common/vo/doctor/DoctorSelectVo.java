package com.tpkd.common.vo.doctor;

public class DoctorSelectVo {
    private Integer departmentId;
    private Integer serviceId;
    private String acs;
    private String desc;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getAcs() {
        return acs;
    }

    public void setAcs(String acs) {
        this.acs = acs;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
