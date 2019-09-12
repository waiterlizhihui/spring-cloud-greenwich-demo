package com.waiter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix//开启hystrix
public class EurekaServiceConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConsumerRibbonApplication.class, args);
    }

    /**
     * 向spring容器中注入开启了负载均衡功能的RestTemplate
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
