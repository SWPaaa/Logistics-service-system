package com.swp.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * t_user
 * @author 
 */
@Data
public class UserEntity implements Serializable {
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态(0为未审核，1为审核通过，2位审核未通过)
     */
    private Integer status;

    /**
     * 类别（0物流需求方，1物流供应方，2管理员）
     */
    private Integer type;

    /**
     * 名称
     */
    private String name;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 个人电话
     */
    private String phone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司名称
     */
    private String companyName;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 公司证明材料路径
     */
    private String companyUrl;

    /**
     * 是否删除:0否，1是
     */
    private Integer isDelete;

    /**
     * 性别:0男，1女
     */
    private Integer sex;

    /**
     * 省市代码
     */
    private String areaCode;

    private static final long serialVersionUID = 1L;
}