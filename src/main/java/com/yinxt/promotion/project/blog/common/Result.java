package com.yinxt.promotion.project.blog.common;

import lombok.Data;

/**
 * 消息返回类
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private String retCode;
    /**
     * 消息
     */
    private String retMsg;
    /**
     * 数据内容
     */
    private T data;

    public Result() {

    }

    public Result(String retCode, String retMsg) {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public Result(String retCode, String retMsg, T data) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.data = data;
    }

    public Result(ResultEnum resultEnum) {
        this.retCode = resultEnum.getCode();
        this.retMsg = getRetMsg();
    }

    public Result(ResultEnum resultEnum, T data) {
        this.retCode = resultEnum.getCode();
        this.retMsg = resultEnum.getName();
        this.data = data;
    }

    public void success(T data) {
        this.retCode = ResultEnum.SUCCESS.getCode();
        this.retMsg = ResultEnum.SUCCESS.getName();
        this.data = data;
    }

    public void error(T data) {
        this.retCode = ResultEnum.SYSTEM_ERROR.getCode();
        this.retMsg = ResultEnum.SYSTEM_ERROR.getName();
    }
}
