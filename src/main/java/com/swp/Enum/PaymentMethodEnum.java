package com.swp.Enum;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author wanping.sheng
 * @Filename paymentMethodEnum
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/30 17:05</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public enum PaymentMethodEnum {
    COLLECT(0,"到付"),
    CASH_PLEDGE(1,"押金"),
    FULL_PAYMENT(2,"全款"),
    ;
    private int value;
    private String text;

    PaymentMethodEnum(int value, String text) {
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
