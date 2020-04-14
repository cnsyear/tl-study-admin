package com.tlstudyadmin.modules.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.tlstudyadmin.framework.vo.*;
import com.tlstudyadmin.framework.utils.*;

/**
 * @Description 消息中间件:RabbitMq
 * @Author jie.zhao
 * @Date 2020/4/14 18:37
 */
@Api(value = "/api/rabbitMqApi", tags = "消息中间件:RabbitMQ")
@RestController
@RequestMapping("/api/rabbitMqApi")
public class RabbitMqApi {

    @GetMapping(value = "/test")
    @ApiOperation(value = "测试方法")
    public RestResult<String> get() {

        return new RestResultUtil<String>().setData("0001");
    }
}