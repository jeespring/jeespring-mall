package com.jeespring.common.vo;

import java.io.Serializable;

/**
 * ResponseVO
 *
 * @author 张朝阳
 * @date 2022/2/3 15:54:54
 */
public class ResponseVO<T> implements Serializable {

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 响应体
     */
    private T data;

    public ResponseVO() {
    }

    public ResponseVO(String code) {
        this.code = code;
    }

    public ResponseVO(T data) {
        this.data = data;
    }

    public ResponseVO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseVO(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseVO(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
