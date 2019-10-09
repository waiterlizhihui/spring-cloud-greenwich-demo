package com.waiter.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName HostAddrKeyResolver
 * @Description 根据HostAddress进行限流的配置
 * @Author lizhihui
 * @Date 2019/10/8 18:58
 * @Version 1.0
 */
public class HostAddrKeyResolver implements KeyResolver {
    @Override
    public Mono<String>  resolve(ServerWebExchange serverWebExchange){
        return Mono.just(serverWebExchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }

}
