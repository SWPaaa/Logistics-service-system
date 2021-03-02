package com.swp.service.impl;

import com.swp.model.condition.UserLoginCondition;
import com.swp.repository.UserDao;
import com.swp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanping.sheng
 * @Filename UserServiceImpl
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:33</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    /**
     * 登录验证
     * @param condition
     */
    @Override
    public void login(UserLoginCondition condition) {
        dao.login(condition);
    }
}
