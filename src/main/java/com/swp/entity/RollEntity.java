package com.swp.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * roll
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RollEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

}