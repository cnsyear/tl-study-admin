package com.tlstudyadmin.modules.compent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description 消息消费者
 * @Author jie.zhao
 * @Date 2020/4/14 19:58
 */
@Component
@Slf4j
public class MsgReceiver {

    @Bean
    public Queue test() {
        Queue queue = new Queue("test",true,false,false);
        return queue;
    }

}