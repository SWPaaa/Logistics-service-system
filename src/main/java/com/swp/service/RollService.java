package com.swp.service;

import com.swp.entity.RollEntity;
import java.util.List;

/**
 * (Roll)表服务接口
 *
 * @author makejava
 * @since 2021-03-12 11:34:03
 */
public interface RollService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RollEntity queryById(Integer id);

}