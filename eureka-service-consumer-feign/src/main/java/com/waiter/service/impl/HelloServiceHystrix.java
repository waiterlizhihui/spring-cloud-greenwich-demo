package com.waiter.service.impl;

import com.waiter.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloServiceHystrix
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/9/11 11:06
 * @Version 1.0
 */
@Component
public class HelloServiceHystrix implements HelloService {
    /**
     * 服务失败时的回调
     * @param name
     * @return
     */
    @Override
    public String hello(String name) {
        return "fall back:" + name;
    }
}
