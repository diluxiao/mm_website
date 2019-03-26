package com.net18.website.core.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * 响应信息封装
 *
 * @author tangjialin on 2018-05-07.
 */
@ApiModel(description = "响应信息封装")
public class ResponseMessage<T> implements Serializable {
    private static final long serialVersionUID = -4714259069678234112L;
    /** 业务状态:true:成功;false:失败 */
    @ApiModelProperty(value = "业务状态:true:成功;false:失败")
    private boolean success = false;
    /** 业务代码 */
    @ApiModelProperty(value = "业务代码")
    private int code;
    /** 响应内容 */
    @ApiModelProperty(value = "响应内容")
    private String message;
    /** 响应扩展数据 */
    @ApiModelProperty(value = "响应数据")
    private T data;

    public ResponseMessage() {
    }

    public ResponseMessage(boolean success) {
        this.success = success;
    }

    public ResponseMessage(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public ResponseMessage<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResponseMessage<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseMessage<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseMessage<T> setData(T data) {
        this.data = data;
        return this;
    }

}
