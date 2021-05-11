package com.swp.model.dto;

import lombok.Data;
import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserDetailsDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/5/7 16:25</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserDetailsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 移动电话
     */
    private String phone;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 省市名称
     */
    private String areaName;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 公司电话
     */
    private String companyPhone;
    /**
     * 行业类型
     */
    private Integer type;

    /**
     * 公司证明保存路径
     */
    private String companyUrl;

    /**
     * 备注
     */
    private String remark;
}
