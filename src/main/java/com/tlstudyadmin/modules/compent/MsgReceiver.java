package com.tlstudyadmin.modules.compent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description 消息消费者
 * @Author jie.zhao
 * @Date 2020/4/14 19:58
 */
@Component
@Slf4j
public class MsgReceiver {

    @RabbitListener(queues = {"tl.study.direct.queue"})
    public void tulingClusterQueue(Message message, Channel channel) throws IOException {
        String msg = new String(message.getBody());
        log.info("监听tlStudyDirectQueue消费消息:{}", msg);
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }

}