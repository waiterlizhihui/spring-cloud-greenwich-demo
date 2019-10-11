package com.waiter.nacosserviceconsumer.service;

import com.waiter.nacosserviceconsumer.service.impl.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-provider",fallback = HelloServiceHystrix.class)
public interface IHelloService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);
}
