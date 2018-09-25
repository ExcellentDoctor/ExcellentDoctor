package com.tpkd.common.mapper;

import com.tpkd.common.pojo.User;
import com.tpkd.common.vo.user.LoginVo;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    User loginByPhone(LoginVo loginVo);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}