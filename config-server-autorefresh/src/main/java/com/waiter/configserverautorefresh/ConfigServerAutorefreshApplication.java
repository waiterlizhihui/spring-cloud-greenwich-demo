package com.waiter.configserverautorefresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer//启用spring cloud config服务
@EnableEurekaClient
public class ConfigServerAutorefreshApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAutorefreshApplication.class, args);
    }

}
