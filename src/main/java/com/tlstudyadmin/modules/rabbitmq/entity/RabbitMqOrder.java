package com.tlstudyadmin.modules.rabbitmq.entity;

import com.tlstudyadmin.modules.rabbitmq.enums.RabbitMqOrderStatusEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description RabbitMq可靠性投递--- 模拟订单表
 * @Author jie.zhao
 * @Date 2020/4/14 17:06
 */
@Entity
@Data
@Table(name = "rabbitmq_order")
public class RabbitMqOrder {

    @Id
    @Column(name = "order_no", unique = true, nullable = false, length = 32)
    private String orderNo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "user_name")
    private String userName;

    private double money;

    @Column(name = "product_no")
    private Integer productNo;

    @Column(name = "order_status")
    private Integer orderStatus= RabbitMqOrderStatusEnum.SUCCESS.getCode();
}
