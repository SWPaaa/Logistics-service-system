//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.swp.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class RRException extends RuntimeException implements Serializable {
    private int code;
    private String msg;

    public RRException(CommonResponseEnum response) {
        super(response.message());
        this.code = response.code();
        this.msg = response.message();
    }

    public RRException(String message, CommonResponseEnum response) {
        super(message);
        this.code = response.code();
        this.msg = response.message();
    }

    public RRException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }



    public RRException(String msg, Throwable e) {
        super(msg, e);
    }




}
