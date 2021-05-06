package com.swp.model.dto;

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
public class UserCommodityPageDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 货物类型:0普通用品,1危险品,2冷冻冷藏品,3电器用品，4电询
     */
    private Integer commodityType;
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
     * 电话
     */
    private String phone;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 公司name
     */
    private String companyName;
    /**
     * 公司电话
     */
    private String companyPhone;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 类别（0物流需求方，1物流供应方，2管理员）
     */
    private Integer userType;

}
