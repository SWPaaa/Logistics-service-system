package com.swp.model.condition;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

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
public class NewsSaveCondition implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    @NotBlank(message ="标题不能为空")
    private String title;

    /**
     * 内容
     */
    @NotBlank(message ="内容不能为空")
    private String content;

    private LocalDateTime createTime;

}
