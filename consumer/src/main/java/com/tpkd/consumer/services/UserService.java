package com.tpkd.consumer.services;

import com.tpkd.common.pojo.User;

public interface UserService {
    User selectById(int id);
}
