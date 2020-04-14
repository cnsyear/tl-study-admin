package com.tlstudyadmin.modules.rabbitmq.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.tlstudyadmin.framework.vo.*;
import com.tlstudyadmin.framework.utils.*;

/**
 * @Description rabbitMq学习相关API
 * @Author jie.zhao
 * @Date 2020/4/14 18:37
 */
@Api(value = "/api/rabbitMqStudy", tags = "rabbitMqStudy")
@RestController
@RequestMapping("/api/rabbitMqStudy")
public class RabbitMqStudyApi {

    @GetMapping(value = "/test")
    @ApiOperation(value = "测试方法")
    public RestResult<String> get() {

        return new RestResultUtil<String>().setData("0001");
    }
}
