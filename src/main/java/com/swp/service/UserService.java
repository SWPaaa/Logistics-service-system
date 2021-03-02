package com.swp.service;

import com.swp.model.condition.UserLoginCondition;

/**
 * @author wanping.sheng
 * @Filename UserService
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:34</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface UserService {
    /**
     * 登录验证
     * @param condition
     */
    void login(UserLoginCondition condition);
}
