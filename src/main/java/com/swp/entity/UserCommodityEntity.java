package com.swp.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (UserCommodity)实体类
 *
 * @author makejava
 * @since 2021-04-06 17:20:44
 */
@Data
public class UserCommodityEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 货物类型:0普通用品,1危险品,2冷冻冷藏品,3电器用品，4电询
    */
    private Integer commodityType;
    /**
    * 起始地（区域code）
    */
    private String areaCodeOriginal;
    /**
    * 目的地（区域code）
    */
    private String areaCodeDestination;
    /**
    * 截止日期
    */
    private Date endDate;
    /**
    * 是否需要上门服务:0否,1是
    */
    private Integer service;
    /**
    * 货运状态:0待运,1已运
    */
    private Integer status;
    /**
    * 期望价格
    */
    private String price;
    /**
    * 是否删除:0否，1是
    */
    private Integer isDelete;



}