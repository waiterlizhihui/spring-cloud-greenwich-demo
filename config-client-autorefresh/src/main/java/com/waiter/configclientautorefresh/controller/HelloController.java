package com.waiter.configclientautorefresh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/9/11 11:49
 * @Version 1.0
 */
@RestController
@RefreshScope//自动刷新配置开启
public class HelloController {
    @Value("${name}")
    private String name;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "hi " + name;
    }
}
