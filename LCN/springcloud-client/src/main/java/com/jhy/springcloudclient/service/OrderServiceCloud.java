package com.jhy.springcloudclient.service;

import com.jhy.springcloudorderclient.service.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: jihongye
 * @date: 2021/03/09/22:50
 * @description:
 */
@FeignClient(value = "springcloud-order")
public interface OrderServiceCloud extends OrderService {

}
