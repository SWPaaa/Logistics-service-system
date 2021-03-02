package com.swp.controller;

import com.swp.model.condition.UserLoginCondition;
import com.swp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping(value = "/api/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class User {

    @Autowired
    private UserService service;

    /**
     * 登录验证
     * @param condition
     */
    @GetMapping
    public void login(UserLoginCondition condition){
        service.login(condition);
    }

}
