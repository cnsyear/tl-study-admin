package com.tlstudyadmin.modules.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description RabbitMq可靠性投递--- 模拟库存表
 * @Author jie.zhao
 * @Date 2020/4/14 17:06
 */
@Entity
@Data
@Table(name = "rabbitmq_stock")
public class RabbitMqStock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "stock_num")
    private Integer stockNum;

}
