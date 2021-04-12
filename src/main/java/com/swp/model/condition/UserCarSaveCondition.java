package com.swp.model.condition;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wanping.sheng
 * @Filename UserCarSaveCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/31 23:21</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserCarSaveCondition implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long carId;

    private Long userId;
    /**
     * 起始地（区域code）
     */
    private String areaCodeOriginal;
    /**
     * 目的地（区域code）
     */
    private String areaCodeDestination;
    /**
     * 起始地
     */
    private String areaNameOriginal;
    /**
     * 目的地
     */
    private String areaNameDestination;
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



}
