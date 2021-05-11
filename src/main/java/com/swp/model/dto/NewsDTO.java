package com.swp.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wanping.sheng
 * @Filename NewsDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/13 9:29</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class NewsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;

    /**
     * short内容
     */
    private String shortContent;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
