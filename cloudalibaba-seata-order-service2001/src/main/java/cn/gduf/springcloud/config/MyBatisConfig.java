package cn.gduf.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LuoXuanwei
 * @date 2023/10/11 14:11
 */
@Configuration
@MapperScan({"cn.gduf.springcloud.dao"})
public class MyBatisConfig {
}
