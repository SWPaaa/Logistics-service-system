package com.swp.dao;

import com.swp.model.dto.AreaDTO;

import java.util.List;

/**
 * @author wanping.sheng
 * @Filename AreaDao
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/20 14:16</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface AreaDao {

    /**
     * 获取所有省市
     * @return
     */
    List<AreaDTO> getAll();

    /**
     * 根据code获取省市
     * @return
     */
    AreaDTO getByCode(String code);


}
