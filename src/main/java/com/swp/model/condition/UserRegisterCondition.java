package com.swp.model.condition;

import com.swp.Enum.SexEnum;
import com.swp.Enum.UserTypeEnum;
import lombok.Data;
import org.apache.commons.fileupload.FileItem;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.io.File;
import java.io.Serializable;
import java.util.List;

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
public class UserRegisterCondition implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @NotBlank(message = "用户名不为空")
    private String username;
    /**
     * 密码
     */
    @NotBlank(message = "密码不为空")
    private String password;
    /**
     * 名称
     */
    private String name;
    /**
     * 真实姓名
     */
    @NotBlank(message = "真实姓名不为空")
    private String realName;
    /**
     * 性别
     */
    private SexEnum sex;
    /**
     * 移动电话
     */
    @NotBlank(message = "移动电话不为空")
    private String phone;
    /**
     * 公司名称
     */
    @NotBlank(message = "公司名称不为空")
    private String companyName;
    /**
     * 省市代码
     */
    @NotBlank(message = "省市代码不为空")
    private String areaCode;
    /**
     * 公司地址
     */
    @NotBlank(message = "公司地址不为空")
    private String companyAddress;
    /**
     * 公司电话
     */
    @NotBlank(message = "公司电话不为空")
    private String companyPhone;
    /**
     * 行业类型
     */
    private UserTypeEnum type;
    /**
     * 公司证明
     */
    private MultipartFile file;
    /**
     * 公司证明保存路径
     */
    private String companyUrl;
    /**
     * 备注
     */
    private String remark;

}
