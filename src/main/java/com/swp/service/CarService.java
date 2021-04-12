package com.swp.service;

import com.swp.model.condition.CarSaveCondition;
import com.swp.model.dto.CarDTO;

import java.util.List;

/**
 * (Roll)表服务接口
 *
 * @author makejava
 * @since 2021-03-12 11:34:03
 */
public interface CarService {

    /**
     * 通过ID查询单条数据
     * @return 实例对象
     */
    List<CarDTO> queryById(Long userId);

    void save(CarSaveCondition condition);

}