package com.jhy.springcloudorderclient.service.fallback;

import com.jhy.springcloudorderclient.pojo.GOrder;
import com.jhy.springcloudorderclient.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:32
 * @description:
 */
@Service
public class OrderFallbackService implements OrderService {
    @Override
    public Boolean addOrder(GOrder GOrder) {

        return false;
    }
}
