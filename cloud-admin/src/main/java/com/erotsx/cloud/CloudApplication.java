package com.erotsx.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.erotsx.cloud.mapper")
public class CloudApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CloudApplication.class, args);
    }
}
