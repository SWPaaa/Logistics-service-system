package com.swp.Enum;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author wanping.sheng
 * @Filename ServiceEnum
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/30 17:57</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public enum CarStatusEnum {
    NO(0,"待货"),
    YES(1,"已有货"),
            ;
    private int value;
    private String text;

    CarStatusEnum(int value, String text) {
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
