package com.tpkd.common.services;

import com.tpkd.common.pojo.User;

public interface RpcUserServices {
    User selectById(int id);
}
