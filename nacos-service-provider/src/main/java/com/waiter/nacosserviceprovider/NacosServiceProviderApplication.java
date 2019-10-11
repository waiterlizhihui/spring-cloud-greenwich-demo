package com.waiter.nacosserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class NacosServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceProviderApplication.class, args);
    }

    @RequestMapping("/")
    public String echo(String name){
        return "Hello Nacos Discovery" + name;
    }
}
