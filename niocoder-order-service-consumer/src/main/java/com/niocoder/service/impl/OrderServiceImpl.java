package com.niocoder.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.niocoder.bean.OrderInfo;
import com.niocoder.bean.UserInfo;
import com.niocoder.service.OrderService;
import com.niocoder.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<OrderInfo> getOrderListByUserId(String userId) {
        log.info("OrderServiceImpl getOrderListByUserId userId={}", userId);
        UserInfo userInfo = userService.getUserInfoById(userId);
        log.info("userInfo={}", userInfo);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId("001");
        orderInfo.setBuyerName("niocoder");
        orderInfo.setBuyerPhone("1851080405x");
        orderInfo.setBuyerAddress("北京");
        return Arrays.asList(orderInfo);
    }
}
