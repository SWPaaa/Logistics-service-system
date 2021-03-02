package com.swp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserEntity
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:41</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private String password;
}
