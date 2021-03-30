package com.swp.model.dto;

import lombok.Data;
import java.io.Serializable;
/**
 * @author wanping.sheng
 * @Filename AreaDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/20 14:19</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class AreaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 省市代码
     */
    private String code;
    /**
     * 省市名称
     */
    private String name;
}
