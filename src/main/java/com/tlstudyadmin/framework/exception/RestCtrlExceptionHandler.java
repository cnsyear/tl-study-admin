package com.tlstudyadmin.framework.exception;

import com.tlstudyadmin.framework.utils.RestResultUtil;
import com.tlstudyadmin.framework.vo.RestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description 全局异常处理器
 * @Author jie.zhao
 * @Date 2020/4/14 18:20
 */
@Slf4j
@RestControllerAdvice
public class RestCtrlExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public RestResult<Object> handleXCloudException(BusinessException e) {

        String errorMsg = "Business Exception";
        if (e != null) {
            errorMsg = e.getMsg();
            log.error(e.toString(), e);
        }
        return new RestResultUtil<>().setErrorMsg(500, errorMsg);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.OK)
    public RestResult<Object> handleException(Exception e) {

        String errorMsg = "Exception";
        if (e != null) {
            errorMsg = e.getMessage();
            log.error(e.toString(), e);
        }
        return new RestResultUtil<>().setErrorMsg(500, errorMsg);
    }
}
