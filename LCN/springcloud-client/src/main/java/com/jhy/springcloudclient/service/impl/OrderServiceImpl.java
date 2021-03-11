package com.jhy.springcloudclient.service.impl;

import com.jhy.springcloudclient.service.OrderService;
import com.jhy.springcloudclient.service.OrderServiceCloud;
import com.jhy.springcloudorderclient.pojo.GOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: jihongye
 * @date: 2021/03/09/22:53
 * @description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderServiceCloud orderServiceCloud;

    @Override
    public void addOrder(GOrder gOrder) {
        orderServiceCloud.addOrder(gOrder);
    }
}
