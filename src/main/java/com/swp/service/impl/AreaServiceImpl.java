package com.swp.service.impl;

import com.swp.dao.AreaDao;
import com.swp.model.dto.AreaDTO;
import com.swp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanping.sheng
 * @Filename AreaServiceImpl
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/20 14:16</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao dao;

    /**
     * 获取所有省市
     * @return
     */
    @Override
    public List<AreaDTO> getAll() {
        return dao.getAll();
    }
}
