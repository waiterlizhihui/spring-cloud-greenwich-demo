package com.waiter.gateway;

import com.waiter.gateway.config.HostAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path-route", p -> p
//                        .path("/get")//拦截路径为/get的请求
//                        .filters(f -> f.addRequestHeader("Hello", "World"))//给请求头部加上一个header字段
//                        .uri("http://httpbin.org:80"))//路由地址
//                //使用hystrix
//                .route("hystrix-route", p -> p
//                        .host("*.abc.com")//拦截host里面包含abc.com的请求
//                        .filters(f -> f
//                                .hystrix(config -> config
//                                        .setName("mycmd")
//                                        .setFallbackUri("forward:/fallback")))//利用hystrix对拦截进行处理
//                        .uri("http://httpbin.org:80"))
//                .build();
//    }

    /**
     * 这里对应上面的setFallbackUri路由，
     * Mono是webflux的类，响应式编程的写法
     * @return
     */
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

    /**
     * 将HostAddrKeyResolver注册到Spring中，用于IP限流
     * @return
     */
    @Bean()
    public HostAddrKeyResolver hostAddrKeyResolver(){
        return new HostAddrKeyResolver();
    }
}
