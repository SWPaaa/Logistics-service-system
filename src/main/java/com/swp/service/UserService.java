package com.swp.service;

import com.swp.common.CommonResult;
import com.swp.model.condition.UserListCondition;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.model.dto.UserDTO;
import com.swp.model.dto.UserDetailsDTO;
import com.swp.model.dto.UserListDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

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
@Validated
public interface UserService {

    /**
     * 登录验证
     * @param condition
     */
    CommonResult login(@Valid UserLoginCondition condition);

    /**
     * 管理端登录验证
     * @param condition
     */
    CommonResult adminLogin(@Valid UserLoginCondition condition);

    /**
     * 注册
     * @param condition
     */
    CommonResult save(@Valid UserRegisterCondition condition) throws IOException;

    /**
     * 用户管理
     * @param condition
     * @return
     */
    List<UserListDTO> ListData(UserListCondition condition);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

    /**
     * 修改状态
     * @param id
     * @param Status
     */
    void updateStatus(Long id, Integer Status);

    /**
     * 用户审核详情
     * @return
     */
    List<UserDetailsDTO> getUserDetails(UserListCondition condition);
}
