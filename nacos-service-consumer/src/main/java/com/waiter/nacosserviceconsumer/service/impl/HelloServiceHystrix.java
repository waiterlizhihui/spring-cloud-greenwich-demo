package com.waiter.nacosserviceconsumer.service.impl;

import com.waiter.nacosserviceconsumer.service.IHelloService;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloServiceHystrix
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/10/11 10:59
 * @Version 1.0
 */
@Component
public class HelloServiceHystrix implements IHelloService {
    @Override
    public String hello(String name) {
        return "fall back:" + name;
    }
}
