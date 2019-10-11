package com.waiter.nacosserviceconsumer.controller;

import com.waiter.nacosserviceconsumer.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/10/11 10:57
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    IHelloService helloService;

    @RequestMapping("/")
    public String hello(String name){
        return helloService.hello(name);
    }
}
