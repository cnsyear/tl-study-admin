package com.tlstudyadmin.framework.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description RabbitMq可靠性投递--- 消息状态枚举
 * @Author jie.zhao
 * @Date 2020/4/14 17:36
 */
@AllArgsConstructor
@Getter
public enum RabbitMqMsgStatusEnum {
    SENDING(0, "发送中"),
    SENDING_SUCCESS(1, "消息发送成功"),
    SENDING_FAIL(2, "消息发送失败"),
    CONSUMER_SUCCESS(3, "消费成功"),
    CONSUMER_FAIL(4, "消费失败");

    private Integer code;
    private String msgStatus;
}
