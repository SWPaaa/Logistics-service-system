package com.swp.controller;

import com.swp.common.CommonResult;
import com.swp.entity.UserCommodityEntity;
import com.swp.model.condition.UserCarPageCondition;
import com.swp.model.condition.UserCommodityPageCondition;
import com.swp.service.UserCommodityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TUserCommodity)表控制层
 *
 * @author makejava
 * @since 2021-04-06 17:20:44
 */
@RestController
@RequestMapping("/api/v1/user/commodity")
public class UserCommodityController {
    /**
     * 服务对象
     */
    @Resource
    private UserCommodityService userCommodityService;

    /**
     * 搜索发布的商品
     * @param condition
     */
    @GetMapping("/page")
    public CommonResult page(UserCommodityPageCondition condition) {
        return CommonResult.ok(userCommodityService.page(condition));
    }


}