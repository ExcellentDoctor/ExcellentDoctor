package com.tpkd.common.services;

import com.tpkd.common.pojo.User;
import com.tpkd.common.vo.user.RegisterVo;

/**
 * @author jyk
 */
public interface RpcUserServices {

    /**
     * 新增用户
     * @param registerVo
     * @return
     */
    Boolean addUser(RegisterVo registerVo);

}
