package com.waiter.controller;

import com.waiter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/9/11 10:35
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello(String name) {
        return helloService.hello(name);
    }
}
