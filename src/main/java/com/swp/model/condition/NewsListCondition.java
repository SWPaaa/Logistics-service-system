package com.swp.model.condition;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserListCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/5/6 10:55</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class NewsListCondition implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 从第多少条数据开始
     */
    private Integer index;

    /**
     * 每页数量
     */
    private Integer count;

}
