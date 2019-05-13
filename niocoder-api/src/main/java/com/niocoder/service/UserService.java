package com.niocoder.service;

import com.niocoder.bean.UserInfo;

/**
 * 用户服务 API
 */
public interface UserService {

    /**
     * 根据用户Id 获取用户信息
     *
     * @param UserId
     * @return
     */
    UserInfo getUserInfoById(Integer UserId);
}
