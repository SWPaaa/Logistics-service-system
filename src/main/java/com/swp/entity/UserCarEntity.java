package com.swp.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUserCar)实体类
 *
 * @author makejava
 * @since 2021-03-30 15:27:21
 */
@Data
public class UserCarEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 车辆id
    */
    private Long carId;
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
    private Date data;
    /**
    * 途径区域
    */
    private String passArea;
    /**
    * 付款方式:0到付,1押金,2全款
    */
    private Integer paymentMethod;
    /**
    * 是否提供上门服务:0否,1是
    */
    private Integer service;
    /**
    * 货运状态:0待货,1已有货
    */
    private Integer status;
    /**
    * 返程车:0否,1是
    */
    private Integer goBack;
    /**
    * 货物类型:0电询,1不限
    */
    private Integer type;
    /**
    * 价格(元)
    */
    private Double price;
    /**
    * 收费方式:0:元/车,1:元/立方米
    */
    private Integer priceWay;
    /**
    * 是否删除:0否，1是
    */
    private Integer isDelete;



}