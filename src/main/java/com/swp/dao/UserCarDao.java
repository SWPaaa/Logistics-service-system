package com.swp.dao;

import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.dto.UserCarPageDTO;
import java.util.List;

/**
 * (TUserCar)表数据库访问层
 *
 * @author makejava
 * @since 2021-03-30 15:27:30
 */
public interface UserCarDao {
    /**
     * 搜索发布的运输工程
     * @param condition
     * @return
     */
    List<UserCarPageDTO> page(UserCarPageCondition condition);

}