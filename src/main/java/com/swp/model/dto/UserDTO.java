package com.swp.model.dto;

import com.swp.Enum.UserStatusEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserDTO
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/4 11:14</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private Integer status;

    private String name;
}
