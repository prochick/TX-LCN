package com.jhy.springcloudorder.controller;

import com.jhy.springcloudorder.service.OrderService;
import com.jhy.springcloudorderclient.pojo.GOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jihongye
 * @date: 2021/03/09/20:56
 * @description:
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("order/add")
    public Boolean addUser(@RequestBody GOrder GOrder) {
        return orderService.addOrder(GOrder);
    }
}
