package com.jhy.springcloudstock.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jhy.springcloudstockclient.pojo.GStock;
import org.springframework.stereotype.Repository;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:55
 * @description:
 */
@Repository
public interface StockDao extends BaseMapper<GStock> {
}
