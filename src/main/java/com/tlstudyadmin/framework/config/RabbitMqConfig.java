package com.tlstudyadmin.framework.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description RabbitMq配置文件
 * @Author jie.zhao
 * @Date 2020/4/14 21:18
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public DirectExchange tlStudyDirectExchange() {
        DirectExchange directExchange = new DirectExchange("tl.study.direct.exchange", true, false);
        return directExchange;
    }

    @Bean
    public Queue tlStudyDirectQueue() {
        Queue queue = new Queue("tl.study.direct.queue", true, false, false);
        return queue;
    }

    @Bean
    public Binding tlStudyDirectBinder() {
        return BindingBuilder.bind(tlStudyDirectQueue()).to(tlStudyDirectExchange()).with("tl.study.direct.key");
    }
}
