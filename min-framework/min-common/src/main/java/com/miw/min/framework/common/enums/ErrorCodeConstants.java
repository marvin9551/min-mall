package com.miw.min.framework.common.enums;

import com.miw.min.framework.common.core.ErrorCode;

/**
 * @ClassName ErrorCodeConstants
 * @Description 全局错误码枚举
 * @Author marvin
 * @DATE 2024/1/30 10:00
 **/
public interface ErrorCodeConstants {

    ErrorCode SUCCESS = new ErrorCode(200,"成功");

    // ========== 客户端错误段 ==========
    ErrorCode BAD_REQUEST = new ErrorCode(400, "请求参数不正确");

    ErrorCode NOT_FOUND = new ErrorCode(404, "请求未找到");

    ErrorCode METHOD_NOT_ALLOWED = new ErrorCode(405, "请求方法不正确");


    // ========== 服务端错误段 ==========

    ErrorCode INTERNAL_SERVER_ERROR = new ErrorCode(500, "系统异常");
}
