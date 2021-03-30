package com.swp.Enum;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author wanping.sheng
 * @Filename carTypeEnum
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/30 17:18</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public enum CarTypeEnum {
    semitrailer(0,"半挂车"),
    COMMON(1,"普通车"),
    BOX(2,"箱式车"),
    ;
    private int value;
    private String text;

    CarTypeEnum(int value, String text) {
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
