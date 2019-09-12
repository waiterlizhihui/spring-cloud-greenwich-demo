package com.waiter.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/9/10 19:58
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    @HystrixCommand(fallbackMethod = "helloFallBack")//服务调用失败时的回调方法
    public String hello(String name){
        //这里直接写的是服务名： springcloud-eureka-service-provider  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return restTemplate.getForObject("http://spring-cloud-eureka-service-provider?name=" + name, String.class);
    }

    /**
     * 服务失败时的回调方法
     * @param name
     * @return
     */
    public String helloFallBack(String name){
        return "fall back:" + name;
    }
}
