package com.swp.service;

import com.swp.entity.UserCommodityEntity;
import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.condition.UserCommodityPageCondition;
import com.swp.model.dto.UserCarPageDTO;
import com.swp.model.dto.UserCommodityPageDTO;

import java.util.List;

/**
 * (UserCommodity)表服务接口
 *
 * @author makejava
 * @since 2021-04-06 17:20:44
 */
public interface UserCommodityService {

    /**
     * 搜索发布的商品
     * @param condition
     * @return
     */
    List<UserCommodityPageDTO> page(UserCommodityPageCondition condition);

}