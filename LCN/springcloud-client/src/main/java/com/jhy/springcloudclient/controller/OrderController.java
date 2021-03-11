package com.jhy.springcloudclient.controller;

import com.jhy.springcloudclient.service.OrderService;
import com.jhy.springcloudorderclient.pojo.GOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jihongye
 * @date: 2021/03/09/22:52
 * @description:
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("order/add")
    public String addOrder(GOrder gOrder){
        orderService.addOrder(gOrder);

        return "ok";
    }

}
