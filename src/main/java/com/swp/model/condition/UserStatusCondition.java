package com.swp.model.condition;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserStatusCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/5/7 13:41</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserStatusCondition implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;

}
