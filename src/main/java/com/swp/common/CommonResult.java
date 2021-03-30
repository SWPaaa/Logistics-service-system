

package com.swp.common;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author dell
 * @param <T>
 */
@Data
@AllArgsConstructor
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String msg;
    private T data;

    public CommonResult() {
        this.code = 0;
        this.msg = "success";
    }

    public CommonResult(CommonResponseEnum response) {
        this.code = response.code();
        this.msg = response.message();
    }

    public CommonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public static CommonResult error(int code, String msg) {
        CommonResult r = new CommonResult();
        r.code = code;
        r.msg = msg;
        return r;
    }

    public static <T> CommonResult<T> ok(String msg) {
        CommonResult<T> r = new CommonResult();
        r.msg = msg;
        return r;
    }

    public static <T> CommonResult<T> ok() {
        return new CommonResult();
    }

    public static <T> CommonResult<T> ok(T object) {
        CommonResult<T> r = new CommonResult();
        r.setData(object);
        return r;
    }
}
