package com.swp.controller;

import com.swp.common.CommonResult;
import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.condition.UserCarSaveCondition;
import com.swp.service.UserCarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * (TUserCar)表控制层
 *
 * @author makejava
 * @since 2021-03-30 15:27:44
 */
@RestController
@RequestMapping("/api/v1/userCar")
public class UserCarController {
    /**
     * 服务对象
     */
    @Resource
    private UserCarService userCarService;

    /**
     * 搜索发布的运输工程
     * @param condition
     */
    @GetMapping("/page")
    public CommonResult page(UserCarPageCondition condition) {
        return CommonResult.ok(userCarService.page(condition));
    }

    /**
     * 保存
     * @param condition
     * @return
     */
    @PostMapping
    public CommonResult save(@RequestBody(required = false) UserCarSaveCondition condition){
        userCarService.save(condition);
        return CommonResult.ok();
    }

}