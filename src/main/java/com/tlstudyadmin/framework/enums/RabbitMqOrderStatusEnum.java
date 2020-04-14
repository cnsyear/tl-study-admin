package com.tlstudyadmin.framework.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description RabbitMq可靠性投递--- 订单状态枚举
 * @Author jie.zhao
 * @Date 2020/4/14 17:36
 */
@AllArgsConstructor
@Getter
public enum RabbitMqOrderStatusEnum {
    SUCCESS(0, "订单生成"),
    ERROR(1, "订单作废");

    private Integer code;
    private String msgStatus;
}
