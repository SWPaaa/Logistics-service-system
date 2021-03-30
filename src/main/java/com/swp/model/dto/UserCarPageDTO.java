package com.swp.model.dto;

import com.swp.Enum.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wanping.sheng
 * @Filename UserCarPageDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/30 17:27</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserCarPageDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 起始地（区域code）
     */
    private String areaCodeOriginal;
    private String areaNameOriginal;
    /**
     * 目的地（区域code）
     */
    private String areaCodeDestination;
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
    // private PaymentMethodEnum paymentMethodEnum;
    private Integer paymentMethod;
    /**
     * 是否提供上门服务:0否,1是
     */
    //private ServiceEnum serviceEnum;
    private Integer service;
    /**
     * 货运状态:0待货,1已有货
     */
    //private CarStatusEnum statusEnum;
    private Integer status;
    /**
     * 返程车:0否,1是
     */
    //private ServiceEnum goBackEnum;
    private Integer goBack;
    /**
     * 货物类型:0电询,1不限
     */
    //private GoodsTypeEnum typeEnum;
    private Integer type;
    /**
     * 价格(元)
     */
    private Double price;
    /**
     * 收费方式:0:元/车,1:元/立方米
     */
    //private PriceWayEnum priceWayEnum;
    private Integer priceWay;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 电话
     */
    private String phone;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 车辆类型:0半挂车;1普通车;2箱式车
     */
    //private CarTypeEnum carTypeEnum;
    private Integer carType;
    /**
     * 载重（吨）
     */
    private Integer carLoad;
    /**
     * 体积（立方米）
     */
    private Integer carBulk;


}
