package com.swp.service.impl;

import com.swp.entity.UserCommodityEntity;
import com.swp.dao.UserCommodityDao;
import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.condition.UserCommodityPageCondition;
import com.swp.model.dto.UserCarPageDTO;
import com.swp.model.dto.UserCommodityPageDTO;
import com.swp.service.UserCommodityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserCommodity)表服务实现类
 *
 * @author makejava
 * @since 2021-04-06 17:20:44
 */
@Service("userCommodityService")
public class UserCommodityServiceImpl implements UserCommodityService {
    @Resource
    private UserCommodityDao userCommodityDao;

    /**
     * 搜索发布的商品
     * @param condition
     * @return
     */
    @Override
    public List<UserCommodityPageDTO> page(UserCommodityPageCondition condition) {
        return userCommodityDao.page(condition);
    }
}