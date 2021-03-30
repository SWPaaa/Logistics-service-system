package com.swp.controller;

import com.swp.model.dto.AreaDTO;
import com.swp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wanping.sheng
 * @Filename AreaController
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/20 14:14</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */

@RestController
@RequestMapping(value = "/api/v1/area")
public class AreaController {

    @Autowired
    private AreaService service;

    /**
     * 获取所有省市
     * @return
     */
    @GetMapping("/all")
    public List<AreaDTO> getAll(){
        System.out.println(service.getAll());
        return service.getAll();
    }
}
