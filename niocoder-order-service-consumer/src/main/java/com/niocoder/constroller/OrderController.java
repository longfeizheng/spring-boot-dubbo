package com.niocoder.constroller;

import com.niocoder.bean.OrderInfo;
import com.niocoder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/getOrderList")
    public List<OrderInfo> initOrder(@RequestParam("userId") String userId) {
        return orderService.getOrderListByUserId(userId);
    }
}
