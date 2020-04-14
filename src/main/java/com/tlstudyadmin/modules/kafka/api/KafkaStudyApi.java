package com.tlstudyadmin.modules.kafka.api;

import com.tlstudyadmin.framework.utils.RestResultUtil;
import com.tlstudyadmin.framework.vo.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Kafka学习相关API
 * @Author jie.zhao
 * @Date 2020/4/14 18:37
 */
@Api(value = "/api/kafkaStudy", tags = "kafkaStudy")
@RestController
@RequestMapping("/api/kafkaStudy")
public class KafkaStudyApi{


    @GetMapping(value = "/test")
    @ApiOperation(value = "测试方法")
    public RestResult<String> get() {

        return new RestResultUtil<String>().setData("0001");
    }
}
