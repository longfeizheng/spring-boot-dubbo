package com.niocoder.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderInfo implements Serializable {
    /**
     * 订单id.
     */
    private String orderId;

    /**
     * 买家名字.
     */
    private String buyerName;

    /**
     * 买家手机号.
     */
    private String buyerPhone;

    /**
     * 买家地址.
     */
    private String buyerAddress;
}
