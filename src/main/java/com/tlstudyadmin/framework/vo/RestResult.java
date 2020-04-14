package com.tlstudyadmin.framework.vo;


import lombok.Data;

import java.io.Serializable;

/**
 * @Description 前后端交互数据标准
 * @Author jie.zhao
 * @Date 2020/4/14 18:21
 */
@Data
public class RestResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功标志
     */
    private boolean success;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回代码
     */
    private Integer code;

    /**
     * 时间戳
     */
    private long timestamp = System.currentTimeMillis();

    /**
     * 结果对象
     */
    private T result;
}
