package com.jhy.springcloudorderclient.service;

import com.jhy.springcloudorderclient.service.fallback.OrderFallbackService;
import com.jhy.springcloudorderclient.pojo.GOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:26
 * @description:
 */
@Component
@FeignClient(value = "springcloud-order", fallback = OrderFallbackService.class)
public interface OrderService {

    @PostMapping("/order/add")
    Boolean addOrder(@RequestBody GOrder GOrder);
}
