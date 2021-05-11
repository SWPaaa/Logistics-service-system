package com.swp.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserListDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/5/6 10:58</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserListDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 名称
     */
    private String name;
    /**
     * 个人电话
     */
    private String phone;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 类别（0物流需求方，1物流供应方，2管理员）
     */
    private Integer type;
    /**
     * 状态(0为未审核，1为审核通过，2位审核未通过)
     */
    private Integer status;


}
