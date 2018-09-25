package com.tpkd.consumer.services.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.pojo.User;
import com.tpkd.common.services.RpcUserServices;
import com.tpkd.common.util.SmsUtil;
import com.tpkd.common.vo.user.LoginVo;
import com.tpkd.common.vo.user.RegisterVo;
import com.tpkd.consumer.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jyk
 */
@Service
public class UserServiceImpl implements UserService {

    @Reference
    private RpcUserServices rpcUserServices;

    @Resource
    private SmsUtil smsUtil;


    @Override
    public void SendPhoneMsg(String phoneNum) {
        smsUtil.sendMsg(phoneNum);
    }

    @Override
    public Boolean addUser(RegisterVo registerVo) {
        return rpcUserServices.addUser(registerVo);
    }

    @Override
    public User login(LoginVo loginVo) {
        return rpcUserServices.login(loginVo);
    }

}
