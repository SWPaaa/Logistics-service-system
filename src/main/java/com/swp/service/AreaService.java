package com.swp.service;

import com.swp.model.dto.AreaDTO;

import java.util.List;

/**
 * @author wanping.sheng
 * @Filename AreaService
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/20 14:16</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface AreaService {

    /**
     * 获取所有省市
     * @return
     */
    List<AreaDTO> getAll();

}
