package com.waiter.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @ClassName HelloController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/10/8 15:38
 * @Version 1.0
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("a")
    public Mono<String> a(){
        System.out.println("aaaaa");
        return Mono.just("aa");
    }

    @RequestMapping("b")
    public Mono<String> b(){
        System.out.println("bbbbb");
        return Mono.just("bb");
    }
}
