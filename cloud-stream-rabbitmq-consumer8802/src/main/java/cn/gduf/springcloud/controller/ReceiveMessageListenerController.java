package cn.gduf.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * @author LuoXuanwei
 * @date 2023/10/8 23:16
 */
@Component
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String serverPort;

    @Bean
        //这里接收rabbitmq的条件是参数为Consumer 并且 方法名和supplier方法名相同
        //这里的返回值是一个匿名函数 返回类型是consumer 类型和提供者的类型一致
        //supplier发送的exchange是 send-in-0 这里只需要用send方法名即可
    Consumer<String> send() {
        return str -> {
            System.out.println("我是消费者"+serverPort+"，我收到了消息："+str);
        };
    }
}
