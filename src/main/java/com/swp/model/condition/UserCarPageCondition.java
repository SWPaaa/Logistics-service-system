package com.swp.model.condition;

import com.swp.Enum.CarTypeEnum;
import com.swp.Enum.PaymentMethodEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserCarPageCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/30 15:34</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserCarPageCondition implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 车辆类型
     */
    private CarTypeEnum carTypeEnum;
    private Integer carType;
    /**
     * 起始地（区域）
     */
    private String areaNameOriginal;
    /**
     * 目的地（区域）
     */
    private String areaNameDestination;

    /**
     * 付款方式:0到付,1押金,2全款
     */
    private PaymentMethodEnum paymentMethodEnum;
    private Integer paymentMethod;
}
