package com.miw.min.framework.common.core;

import com.miw.min.framework.common.enums.ErrorCodeConstants;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Description 通用返回
 * @Author marvin
 * @DATE 2024/1/30 09:44
 **/
public class Result<T> implements Serializable {
    /**
     * 错误码
     */
    private Integer errorCode;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 错误提示
     */
    private String msg;

    public static <T> Result<T> error(Integer errorCode, String msg) {
        Result<T> result = new Result<>();
        result.errorCode = errorCode;
        result.msg = msg;
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.errorCode = ErrorCodeConstants.SUCCESS.getCode();
        result.data = data;
        result.msg = ErrorCodeConstants.SUCCESS.getMsg();
        return result;
    }
}
