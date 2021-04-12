package com.swp.service.impl;

import com.swp.Enum.PaymentMethodEnum;
import com.swp.dao.AreaDao;
import com.swp.dao.UserCarDao;
import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.condition.UserCarSaveCondition;
import com.swp.model.dto.AreaDTO;
import com.swp.model.dto.UserCarPageDTO;
import com.swp.service.UserCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserCar)表服务实现类
 *
 * @author makejava
 * @since 2021-03-30 15:27:43
 */
@Service("userCarService")
public class UserCarServiceImpl implements UserCarService {
    @Resource
    private UserCarDao userCarDao;

    @Resource
    private AreaDao areaDao;
    /**
     * 搜索发布的运输工程
     * @param condition
     * @return
     */
    @Override
    public List<UserCarPageDTO> page(UserCarPageCondition condition) {
        return userCarDao.page(condition);
    }

    /**
     * 保存
     * @param condition
     */
    @Override
    public void save(UserCarSaveCondition condition) {
        condition.setAreaNameDestination(areaDao.getByCode(condition.getAreaCodeDestination()).getName());
        condition.setAreaNameOriginal(areaDao.getByCode(condition.getAreaCodeOriginal()).getName());
        userCarDao.save(condition);
    }
}