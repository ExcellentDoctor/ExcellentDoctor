package com.tpkd.common.vo.user;

import java.io.Serializable;

public class LoginVo implements Serializable {

    private String phoneNumber;

    private String password;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
