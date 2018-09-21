package com.tpkd.common.mapper;

import com.tpkd.common.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where userId=#{id}")
     User selectById(int id);
}
