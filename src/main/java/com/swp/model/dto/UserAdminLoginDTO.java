package com.swp.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wanping.sheng
 * @Filename UserAdminLoginDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/12 17:17</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserAdminLoginDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 状态(0为未审核，1为审核通过，2位审核未通过)
     */
    private Integer status;
    /**
     * 盐
     */
    private String salt;
    /**
     * 密码
     */
    private String password;
    /**
     * 菜单id
     */
    private Long menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 父级菜单id
     */
    private Long parentId;
    /**
     * 菜单链接
     */
    private String link;
    /**
     * 图标链接
     */
    private String icon;

    private List<UserAdminLoginDTO> child;

}
