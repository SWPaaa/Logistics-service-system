package com.swp.dao;

import com.swp.model.condition.UserCommodityPageCondition;
import com.swp.model.condition.UserCommoditySaveCondition;
import com.swp.model.dto.UserCommodityPageDTO;
import java.util.List;

/**
 * (TUserCommodity)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-06 17:20:44
 */
public interface UserCommodityDao {
    /**
     * 搜索发布的商品
     * @param condition
     * @return
     */
    List<UserCommodityPageDTO> page(UserCommodityPageCondition condition);
    /**
     * 保存
     * @param condition
     */
    void save(UserCommoditySaveCondition condition);

}