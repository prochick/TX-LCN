package com.jhy.springcloudstock.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.jhy.springcloudstock.dao.StockDao;
import com.jhy.springcloudstock.service.StockService;
import com.jhy.springcloudstockclient.pojo.GStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:55
 * @description:
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDao stockDao;

    @Override
    @LcnTransaction
    @Transactional
    public Boolean updateStock(Long itemId) {
        UpdateWrapper<GStock> wrapper = new UpdateWrapper<>();
        wrapper.eq("item_id", itemId);
        wrapper.setSql("item_num=中文");

        int update = stockDao.update(null, wrapper);
        if(update > 0){
            return true;
        }

        return false;
    }
}
