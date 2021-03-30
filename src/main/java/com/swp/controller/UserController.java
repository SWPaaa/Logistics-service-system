package com.swp.controller;

import com.swp.common.CommonErrorEnum;
import com.swp.common.CommonResult;
import com.swp.common.RRException;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


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
     * 登录验证
     * @param condition
     */
    @GetMapping("/login")
    public CommonResult login(UserLoginCondition condition){
        return userService.login(condition);
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
