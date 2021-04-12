package com.swp.model.condition;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename CarSaveCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/1 2:41</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class CarSaveCondition implements Serializable {
    private static final long serialVersionUID = 1L;


    private String code;

    private String name;

    private Integer type;

    private Integer load;

    private Integer bulk;

    private Long userId;
}
