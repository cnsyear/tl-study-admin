package com.tlstudyadmin.framework.exception;

import lombok.Data;

/**
 * @Description 自定义业务异常
 * @Author jie.zhao
 * @Date 2020/4/14 18:20
 */
@Data
public class BusinessException extends RuntimeException {

    private String msg;

    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
