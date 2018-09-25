package com.tpkd.common.pojo;

import java.io.Serializable;

public class Doctor implements Serializable {
    //医生id
    private int doctorId;
    //医生姓名
    private String doctorName;
    //部门编号
    private String departmentId;
    //提供服务
    private String services;
    //服务价格
    private String prices;
    //服务人数
    private int serviceNumber;
    //医院id
    private int hospitalId;
    //评论分数
    private int evaluation;
    //推荐指数
    private int recommend;
    //职称
    private String professionalTitle;
    //医学背景
    private String medicalbBackground;
    //个人荣誉
    private String honner;
    //擅长
    private String goodAt;
    //图片
    private int imageId;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public String getMedicalbBackground() {
        return medicalbBackground;
    }

    public void setMedicalbBackground(String medicalbBackground) {
        this.medicalbBackground = medicalbBackground;
    }

    public String getHonner() {
        return honner;
    }

    public void setHonner(String honner) {
        this.honner = honner;
    }

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
