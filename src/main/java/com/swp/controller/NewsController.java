
package com.swp.controller;

import com.swp.common.CommonResult;
import com.swp.model.condition.NewsListCondition;
import com.swp.model.condition.NewsSaveCondition;
import com.swp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 获取新闻列表
     * @param condition
     * @return
     */
    @GetMapping
    public CommonResult getAll(NewsListCondition condition){
        return CommonResult.ok(service.getAll(condition));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("/{id}/delete")
    public CommonResult delete(@PathVariable("id")Long id){
        service.delete(id);
        return CommonResult.ok();
    }

    /**
     * 修改
     * @param id
     * @return
     */
    @PostMapping("/{id}/update")
    public CommonResult update(@PathVariable("id")Long id, @RequestBody NewsSaveCondition condition){
        service.update(id,condition);
        return CommonResult.ok();
    }

    /**
     * 新增
     * @param condition
     * @return
     */
    @PostMapping
    public CommonResult save(@RequestBody NewsSaveCondition condition){
        service.save(condition);
        return CommonResult.ok();
    }

}
