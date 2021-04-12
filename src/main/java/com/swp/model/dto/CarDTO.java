package com.swp.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * (TCar)实体类
 *
 * @author makejava
 * @since 2021-03-31 21:03:14
 */
@Data
public class CarDTO implements Serializable {
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

    private Long userId;

}