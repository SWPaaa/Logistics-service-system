package com.swp.dao;

import com.swp.model.condition.CarSaveCondition;
import com.swp.model.dto.CarDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dell
 */
public interface CarDao {
    /**
     *
     * @param userId
     * @return
     */
    List<CarDTO> selectByPrimaryKey(@Param("userId") Long userId);

    void save(CarSaveCondition condition);

}