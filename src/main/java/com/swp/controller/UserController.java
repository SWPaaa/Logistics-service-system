package com.swp.controller;

import com.swp.common.CommonResult;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;



/**
 * @author wanping.sheng
 * @Filename User
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/2/24 19:48</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping(value = "/api/v1/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * pc端登录验证
     * @param condition
     */
    @GetMapping("/login")
    public CommonResult login(UserLoginCondition condition){
        return userService.login(condition);
    }

    /**
     * 管理端登录验证
     * @param condition
     */
    @PostMapping("/login/admin")
    public CommonResult adminLogin(@RequestBody(required = false) UserLoginCondition condition){
        return userService.adminLogin(condition);
    }

    /**
     * 注册
     * @param condition
     */
    @PostMapping("/register")
    public CommonResult save(UserRegisterCondition condition) throws IOException {
        return userService.save(condition);
    }

}
