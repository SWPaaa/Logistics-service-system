package com.swp.controller;

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
@RequestMapping(value = "/roll", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RollController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    /**
     * 服务对象
     */
    @Autowired
    private RollService rollService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping(value = "/selectOne")
    public void selectOne(Integer id) {
        System.out.println(this.rollService.queryById(id));
    }

}