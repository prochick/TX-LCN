package com.jhy.springcloudstockclient.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author: jihongye
 * @date: 2021/03/09/21:23
 * @description:
 */
@Component
public class GStock implements Serializable {

    private Long itemId;

    private Long itemName;

    private Integer itemNum;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemName() {
        return itemName;
    }

    public void setItemName(Long itemName) {
        this.itemName = itemName;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }
}
