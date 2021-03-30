package com.swp.service.impl;

import com.swp.entity.RollEntity;
import com.swp.dao.RollDao;
import com.swp.service.RollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Roll)表服务实现类
 *
 * @author makejava
 * @since 2021-03-12 11:34:03
 */
@Service("rollService")
public class RollServiceImpl implements RollService {

    @Autowired
    private RollDao rollDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RollEntity queryById(Integer id) {
        return rollDao.selectByPrimaryKey(id);
    }

}