package com.swp.Enum;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author wanping.sheng
 * @Filename GoodsTypeEnum
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/30 18:02</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public enum GoodsTypeEnum {
    CABLE(0,"电询"),
    UNLIMITED(1,"不限"),
            ;
    private int value;
    private String text;

    GoodsTypeEnum(int value, String text) {
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
