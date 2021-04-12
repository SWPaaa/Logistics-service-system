package com.swp.model.condition;

import com.swp.Enum.CarTypeEnum;
import com.swp.Enum.PaymentMethodEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
public class UserCommodityPageCondition implements Serializable {
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

}
