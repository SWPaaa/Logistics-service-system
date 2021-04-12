package com.swp.service.impl;

import com.swp.dao.CarDao;
import com.swp.model.condition.CarSaveCondition;
import com.swp.model.dto.CarDTO;
import com.swp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Roll)表服务实现
 * @author makejava
 * @since 2021-03-12 11:34:03
 */
@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao dao;

    /**
     * 通过ID查询单条数据
     * @return 实例对象
     */
    @Override
    public List<CarDTO> queryById(Long userId) {
        return dao.selectByPrimaryKey(userId);
    }

    @Override
    public void save(CarSaveCondition condition) {
        dao.save(condition);
    }

}