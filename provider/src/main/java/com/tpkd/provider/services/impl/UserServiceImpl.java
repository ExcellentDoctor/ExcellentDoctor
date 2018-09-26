package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.UserMapper;
import com.tpkd.common.pojo.User;
import com.tpkd.common.services.RpcUserService;
import com.tpkd.common.vo.user.LoginVo;
import com.tpkd.common.vo.user.RegisterVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@Service(interfaceClass = RpcUserService.class)
public class UserServiceImpl implements RpcUserService {
    @Resource
    private UserMapper userMapper;


    /**
     * 新增用户
     * @param registerVo
     * @return
     */
    @Override
    public Boolean addUser(RegisterVo registerVo) {
        User user = new User();
        user.setPhoneNumber(registerVo.getPhoneNumber());
        user.setImageId(registerVo.getImageId());
        user.setUserName(registerVo.getUserName());
        user.setPassword(registerVo.getPassword());
        user.setSex(registerVo.getSex());
        return userMapper.insertSelective(user) > 1;
    }

    @Override
    public User login(LoginVo loginVo) {
        User user = userMapper.loginByPhone(loginVo);
        return user;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


}
