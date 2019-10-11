package com.waiter.nacosserviceconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName ConfigController
 * @Description TOOD
 * @Author lizhihui
 * @Date 2019/10/11 14:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/config")
@RefreshScope//使用这个注解开启nacos config的刷新
public class ConfigController {
    /**
     * 读取nacos config里面的useLocalCache属性
     */
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${user.name:test}")
    private String userName;

    @Value("${user.age:85}")
    private int userAge;

    @ResponseBody
    @RequestMapping("/get")
    public Map<String,Object> get(){
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("useLocalCache",useLocalCache);
        resultMap.put("userName",userName);
        resultMap.put("userAge",userAge);
        return resultMap;
    }

}
