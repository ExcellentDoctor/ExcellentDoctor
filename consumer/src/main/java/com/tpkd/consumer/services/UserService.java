package com.tpkd.consumer.services;

import com.tpkd.common.pojo.User;
import com.tpkd.common.vo.user.LoginVo;
import com.tpkd.common.vo.user.RegisterVo;

public interface UserService {


    void SendPhoneMsg(String phoneNum);

    Boolean addUser(RegisterVo registerVo);

    User login(LoginVo loginVo);

}
