package com.tlstudyadmin.framework.utils;

import com.tlstudyadmin.framework.vo.RestResult;

/**
 * @Description 前后端交互数据工具类
 * @Author jie.zhao
 * @Date 2020/4/14 18:22
 */
public class RestResultUtil<T> {

    private RestResult<T> result;

    public RestResultUtil() {
        result = new RestResult<>();
        result.setSuccess(true);
        result.setMessage("success");
        result.setCode(200);
    }

    public RestResult<T> setData(T t) {
        this.result.setResult(t);
        this.result.setCode(200);
        return this.result;
    }

    public RestResult<T> setSuccessMsg(String msg) {
        this.result.setSuccess(true);
        this.result.setMessage(msg);
        this.result.setCode(200);
        this.result.setResult(null);
        return this.result;
    }

    public RestResult<T> setData(T t, String msg) {
        this.result.setResult(t);
        this.result.setCode(200);
        this.result.setMessage(msg);
        return this.result;
    }

    public RestResult<T> setErrorMsg(String msg) {
        this.result.setSuccess(false);
        this.result.setMessage(msg);
        this.result.setCode(500);
        return this.result;
    }

    public RestResult<T> setErrorMsg(Integer code, String msg) {
        this.result.setSuccess(false);
        this.result.setMessage(msg);
        this.result.setCode(code);
        return this.result;
    }

    public static <T> RestResult<T> data(T t) {
        return new RestResultUtil<T>().setData(t);
    }

    public static <T> RestResult<T> data(T t, String msg) {
        return new RestResultUtil<T>().setData(t, msg);
    }

    public static <T> RestResult<T> success(String msg) {
        return new RestResultUtil<T>().setSuccessMsg(msg);
    }

    public static <T> RestResult<T> error(String msg) {
        return new RestResultUtil<T>().setErrorMsg(msg);
    }

    public static <T> RestResult<T> error(Integer code, String msg) {
        return new RestResultUtil<T>().setErrorMsg(code, msg);
    }
}
