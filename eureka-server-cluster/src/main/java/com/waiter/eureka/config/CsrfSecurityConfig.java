package com.waiter.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName CsrfSecurityConfig
 * @Description spring-boot-starter-security配置文件
 * @Author lizhihui
 * @Date 2019/10/8 9:55
 * @Version 1.0
 */
@EnableWebSecurity
public class CsrfSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 由于Spring Boot2.0以上的security默认启用了csrf校验，要在eurekaServer端配置security的scrf校验为false，否则会报错com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
     * 未来解决这个问题，需要手动关闭csrf服务
     * @param httpSecurity
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().disable();
        super.configure(httpSecurity);
    }
}
