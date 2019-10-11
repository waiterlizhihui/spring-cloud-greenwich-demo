package com.waiter.controller;

import com.waiter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @ClassName HelloController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/9/11 10:35
 * @Version 1.0
 */
@RestController
public class HelloController {
    /**
     * 服务链路最终器需要依赖于Log
     */
    private static final Logger LOG  = Logger.getLogger(HelloController.class.getName());

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hello(String name) {
        LOG.log(Level.INFO,"calling trace service-hi");
        return helloService.hello(name);
    }
}
