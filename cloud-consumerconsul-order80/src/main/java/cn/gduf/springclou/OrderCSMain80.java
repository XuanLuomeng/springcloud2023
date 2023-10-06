package cn.gduf.springclou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LuoXuanwei
 * @date 2023/9/27 18:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderCSMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderCSMain80.class, args);
    }
}
