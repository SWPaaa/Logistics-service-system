
package com.swp.controller;

import com.swp.common.CommonResult;
import com.swp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanping.sheng
 * @Filename NewsController
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/13 9:25</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping(value = "/api/v1/news", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class NewsController {

    @Autowired
    private NewsService service;


    @GetMapping
    public CommonResult getAll(){
        return CommonResult.ok(service.getAll());
    }

}
