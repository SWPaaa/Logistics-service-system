package com.swp.controller;

import com.swp.common.CommonResult;
import com.swp.model.condition.CarSaveCondition;
import com.swp.model.condition.UserCarSaveCondition;
import com.swp.service.CarService;
import com.swp.service.RollService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * (Roll)表控制层
 *
 * @author makejava
 * @since 2021-03-12 11:34:03
 */
@RestController
@RequestMapping(value = "/api/v1/car", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CarController {
    private static final Log logger = LogFactory.getLog(CarController.class);

    /**
     * 服务对象
     */
    @Autowired
    private CarService service;

    /**
     * 通过主键查询单条数据
     * @return 单条数据
     */
    @GetMapping(value = "/{userId}")
    public CommonResult select(@PathVariable("userId") Long userId) {
       return CommonResult.ok(service.queryById(userId));
    }

    /**
     * 保存
     * @param condition
     * @return
     */
    @PostMapping
    public CommonResult save(@RequestBody(required = false) CarSaveCondition condition){
        service.save(condition);
        return CommonResult.ok();
    }


}