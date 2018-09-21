package com.tpkd.common.pojo;

public class Answer {
    //回答id
    private int answerId;
    //医生id
    private int doctorId;
    //回答内容
    private String answerValue;
    //图片
    private int imageId;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getAnswerValue() {
        return answerValue;
    }

    public void setAnswerValue(String answerValue) {
        this.answerValue = answerValue;
    }

}
