package com.swp.common;

public enum CommonErrorEnum implements CommonResponseEnum {
    HAVE_USERNAME(101001, "该用户名已存在,请更换后重试!"),
    NO_USERNAME(101002, "无效的用户名或者密码!"),
    STATUS_IS_NO(101003, "请耐心等待管理员审核!"),
    UNAPPROVE(101004, "您的信息未通过审核,请重新注册并确保信息真实性"),
    ;

    private int code;

    private String message;

    CommonErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
    @Override
    public int code() {
        return this.code;
    }
    @Override
    public String message() {
        return this.message;
    }


}