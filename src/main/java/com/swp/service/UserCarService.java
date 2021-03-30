package com.swp.service;


import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.dto.UserCarPageDTO;

import java.util.List;

/**
 * (TUserCar)表服务接口
 *
 * @author makejava
 * @since 2021-03-30 15:27:43
 */
public interface UserCarService {
    /**
     * 搜索发布的运输工程
     * @param condition
     * @return
     */
    List<UserCarPageDTO> page(UserCarPageCondition condition);
}