package com.miw.mall.framework.common.core;

/**
 * @ClassName ErrorCode
 * @Description 错误码对象
 * @Author marvin
 * @DATE 2024/1/30 10:02
 **/
public class ErrorCode {

    private final Integer code;

    private final String msg;


    public ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
