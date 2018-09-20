package com.tpkd.common.pojo;
//`commentId``doctorId``userId``commentValue``Satisfaction`
public class Comment {
    //评论id
    private int commentId;
    //医生id
    private int doctorId;
    //用户id
    private int userId;
    //评论内容
    private String commentValue;
    //满意等级1-5
    private int Satisfaction;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCommentValue() {
        return commentValue;
    }

    public void setCommentValue(String commentValue) {
        this.commentValue = commentValue;
    }

    public int getSatisfaction() {
        return Satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        Satisfaction = satisfaction;
    }
}
