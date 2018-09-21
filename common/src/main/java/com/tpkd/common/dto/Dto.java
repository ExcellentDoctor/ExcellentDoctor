package com.tpkd.common.dto;

import java.io.Serializable;

public class Dto <T> implements Serializable {
    //状态码
    private String errorCode;
    //消息
    private String msg;
    //状态
    private String success;
    //数据
    private T data;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
