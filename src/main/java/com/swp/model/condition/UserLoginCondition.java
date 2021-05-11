package com.swp.model.condition;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author wanping.sheng
 * @Filename UserLoginCondition
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:28</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Data
public class UserLoginCondition implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;


}
