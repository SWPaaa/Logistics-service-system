package com.swp.Enum;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author wanping.sheng
 * @Filename UserTypeEnum
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2020/12/28 18:10</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */

public enum UserTypeEnum {
    LOGISTICS_SUPPLY(0, "物流需求方"),
    LOGISTICS_DEMAND(1, "物流供应方"),
    ADMIN(2, "管理员"),
    ;

    private int value;
    private String text;

    UserTypeEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    @JsonValue
    public int value() {
        return this.value;
    }

    @JsonValue
    public String text() {
        return this.text;
    }

}
