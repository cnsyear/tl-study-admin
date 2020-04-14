package com.tlstudyadmin.modules.api;

import com.tlstudyadmin.modules.compent.MsgSender;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private MsgSender msgSender;

    @GetMapping(value = "/sendTlStudyDirectQueue")
    @ApiOperation(value = "发送直连交换机类型消息")
    public RestResult<String> sendTlStudyDirectQueue(@RequestParam String msg) {
        msgSender.sendTlStudyDirect(msg);

        return new RestResultUtil<String>().setData("发送成功");
    }
}