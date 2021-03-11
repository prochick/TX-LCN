package com.jhy.springcloudorderclient.controller;

import com.jhy.springcloudorderclient.pojo.GOrder;
import com.jhy.springcloudorderclient.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:21
 * @description:
 */
@RestController
public class OrderController{

    @Autowired
    private OrderService orderService;

    @GetMapping("order/add")
    public Boolean addOrder(GOrder GOrder){

        return orderService.addOrder(GOrder);
    }
}
