package cn.gduf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LuoXuanwei
 * @date 2023/10/10 22:25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84{
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}
