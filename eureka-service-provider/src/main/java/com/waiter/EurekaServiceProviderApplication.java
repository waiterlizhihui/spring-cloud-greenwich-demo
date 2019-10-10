package com.waiter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaServiceProviderApplication {
    private static final Logger LOG = Logger.getLogger(EurekaServiceProviderApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProviderApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String hello(String name) {
        LOG.log(Level.INFO,"info  is being called");
        return String.format("hello %s,from port = %s", name, port);
    }

    @RequestMapping("/hello/hi")
    public String  hello2(String name){
        return String.format("hello %s,from port = %s", name, port);
    }
}
