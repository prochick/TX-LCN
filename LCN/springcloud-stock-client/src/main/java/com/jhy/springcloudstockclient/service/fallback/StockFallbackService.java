package com.jhy.springcloudstockclient.service.fallback;

import com.jhy.springcloudstockclient.service.StockService;
import org.springframework.stereotype.Service;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:32
 * @description:
 */
@Service
public class StockFallbackService implements StockService {
    @Override
    public Boolean updateStock(Long itemId) {

        return false;
    }
}
