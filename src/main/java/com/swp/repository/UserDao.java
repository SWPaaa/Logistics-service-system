package com.swp.repository;

import com.swp.model.condition.UserLoginCondition;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author wanping.sheng
 * @Filename UserDao
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:38</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface UserDao {

    /**
     * 登录验证
     * @param condition
     */
    void login(UserLoginCondition condition);
}
