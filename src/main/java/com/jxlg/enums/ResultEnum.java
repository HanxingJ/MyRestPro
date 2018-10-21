package com.jxlg.enums;

/**
 * Created by Administrator on 2018/11/17.
 */
public enum ResultEnum {
    SUCCESS("111111","成功"),
    FAILED("999999","失败");

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
