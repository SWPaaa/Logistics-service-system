package com.swp.dao;

import com.swp.entity.RollEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author dell
 */
public interface RollDao {
    /**
     *
     * @param id
     * @return
     */
    RollEntity selectByPrimaryKey(@Param("id") Integer id);

}