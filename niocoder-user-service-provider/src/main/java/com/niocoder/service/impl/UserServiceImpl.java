package com.niocoder.service.impl;

import com.niocoder.bean.UserInfo;
import com.niocoder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public UserInfo getUserInfoById(String uerId) {
        log.info("UserServiceImpl getUserInfoById userId={}", uerId);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(uerId);
        userInfo.setId(1);
        userInfo.setUserAddress("北京");
        userInfo.setPhoneNum("1851080405x");
        return userInfo;
    }
}
