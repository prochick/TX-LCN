package com.jhy.springcloudstockclient.service;

import com.jhy.springcloudstockclient.service.fallback.StockFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:26
 * @description:
 */
@Component
@FeignClient(value = "springcloud-stock", fallback = StockFallbackService.class)
public interface StockService {

    @GetMapping("stock/update/{itemId}")
    Boolean updateStock(@PathVariable("itemId") Long itemId);
}
