package com.swp.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TCar)实体类
 *
 * @author makejava
 * @since 2021-03-31 21:03:14
 */
@Data
public class CarEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    /**
    * 编号
    */
    private String code;
    /**
    * 名称
    */
    private String name;
    /**
    * 型号:0半挂车;1普通车;2箱式车
    */
    private Integer type;
    /**
    * 载重（吨）
    */
    private Integer load;
    /**
    * 体积（立方米）
    */
    private Integer bulk;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 是否删除:0否，1是
    */
    private Integer isDelete;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    public Integer getBulk() {
        return bulk;
    }

    public void setBulk(Integer bulk) {
        this.bulk = bulk;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}