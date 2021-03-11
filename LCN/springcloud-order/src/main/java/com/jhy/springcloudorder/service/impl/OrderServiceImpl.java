package com.jhy.springcloudorder.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.jhy.springcloudorder.dao.OrderDao;
import com.jhy.springcloudorder.service.OrderService;
import com.jhy.springcloudorder.service.StockServiceCloud;
import com.jhy.springcloudorderclient.pojo.GOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: jihongye
 * @date: 2021/03/09/20:56
 * @description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StockServiceCloud stockServiceCloud;

    @Override
    @LcnTransaction
    @Transactional
    public Boolean addOrder(GOrder gOrder) {
        int insert = orderDao.insert(gOrder);
        // 订单插入成功则减少库存
        if(insert > 0){
            stockServiceCloud.updateStock(gOrder.getItemId());

            return true;
        }

        return false;
    }
}
