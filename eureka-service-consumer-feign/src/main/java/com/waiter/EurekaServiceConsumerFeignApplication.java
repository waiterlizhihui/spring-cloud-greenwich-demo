package com.waiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients//启用Feign的功能
public class EurekaServiceConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConsumerFeignApplication.class, args);
    }

}
