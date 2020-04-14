package com.tlstudyadmin.modules.compent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description 消息生产者
 * @Author jie.zhao
 * @Date 2020/4/14 19:58
 */
@Component
@Slf4j
public class MsgSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * 通过直连交换机发送消息
     *
     * @param msg
     */
    public void sendTlStudyDirect(String msg) {

        rabbitTemplate.convertAndSend("tl.study.direct.exchange","tl.study.direct.key",msg);
    }


}