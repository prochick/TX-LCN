package com.jhy.springcloudstockclient.controller;

import com.jhy.springcloudstockclient.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:21
 * @description:
 */
@RestController
public class StockController{

    @Autowired
    private StockService stockService;

    @GetMapping("/stock/update/{itemId}")
    public Boolean updateStock(@PathVariable("itemId") Long itemId){

        return stockService.updateStock(itemId);
    }

}
