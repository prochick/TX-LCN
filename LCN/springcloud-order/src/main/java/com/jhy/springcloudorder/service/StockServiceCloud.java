package com.jhy.springcloudorder.service;

import com.jhy.springcloudstockclient.service.StockService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: jihongye
 * @date: 2021/03/11/11:43
 * @description:
 */
@FeignClient(value = "springcloud-stock")
public interface StockServiceCloud extends StockService {

}
