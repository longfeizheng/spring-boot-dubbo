package com.niocoder.service;

import com.niocoder.bean.OrderInfo;

import java.util.List;

/**
 * 订单服务API
 */
public interface OrderService {

    /**
     * 通过用户ID获取订单信息
     *
     * @param userId
     * @return
     */
    List<OrderInfo> getOrderListByUserId(Integer userId);
}
