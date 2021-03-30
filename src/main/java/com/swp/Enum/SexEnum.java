package com.swp.Enum;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author wanping.sheng
 * @Filename SexEnum
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2020/12/28 18:10</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public enum SexEnum {
    MAN(0, "男"),
    WOMAN(1, "女"),
    ;

    private int value;
    private String text;

    SexEnum(int value, String text) {
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

