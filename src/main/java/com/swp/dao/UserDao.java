package com.swp.dao;

import com.swp.common.CommonResult;
import com.swp.entity.UserEntity;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.model.dto.UserAdminLoginDTO;
import com.swp.model.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
    UserDTO login(UserLoginCondition condition);

    /**
     * 管理端登录验证
     * @param condition
     */
    List<UserAdminLoginDTO> adminLogin(UserLoginCondition condition);

    /**
     * 注册
     */
    void save(UserEntity entity);

    /**
     * 根据用户名获取数据
     * @param username
     * @return
     */
    UserEntity getByUsername(String username);
}
