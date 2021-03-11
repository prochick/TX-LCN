package com.jhy.springcloudorder.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jhy.springcloudorderclient.pojo.GOrder;
import org.springframework.stereotype.Repository;

/**
 * @author: jihongye
 * @date: 2021/03/09/20:56
 * @description:
 */
@Repository
public interface OrderDao extends BaseMapper<GOrder> {
}
