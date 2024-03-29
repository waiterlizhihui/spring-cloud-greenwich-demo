package com.waiter.service;

import com.waiter.service.impl.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-eureka-service-provider",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
