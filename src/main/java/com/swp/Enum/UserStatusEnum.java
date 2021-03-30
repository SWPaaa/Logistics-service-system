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

public enum UserStatusEnum {
    NO_AUDIT(0, "未审核"),
    PASS_THE_AUDIT(1, "审核通过"),
    UNAPPROVE(2, "审核未通过"),
    ;

    private int value;
    private String text;

    UserStatusEnum(int value, String text) {
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
