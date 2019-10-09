package com.waiter.gateway;

import com.waiter.gateway.config.HostAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class GatewayWithEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayWithEurekaApplication.class, args);
    }
}
