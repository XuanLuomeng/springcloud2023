package cn.gduf.springcloud.service.impl;

import cn.gduf.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author LuoXuanwei
 * @date 2023/10/8 22:45
 */
@Component
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    StreamBridge streamBridge;

    @Override
    public String send() {
        String message = UUID.randomUUID().toString();
        //这里说明一下这个 streamBridge.send 方法的参数 第一个参数是exchange或者topic 就是主题名称
        //默认的主题名称是通过
        //输入:    <方法名> + -in- + <index>
        //输出:    <方法名> + -out- + <index>
        //这里我们接收的时候就要用send方法 参数是consumer<String>接收  详情看8802的controller
        //consumer的参数类型是这里message的类型
        streamBridge.send("send-out-0", message);
        System.out.println("************发送了message："+message);
        return message;
    }
}
