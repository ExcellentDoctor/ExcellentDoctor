package com.tpkd.common.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedisUtil {
    @Resource
    private RedisTemplate redisTemplate;
    //获取redis中元素
    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }
    //添加redis值
    public  boolean set(String key,String value){
        redisTemplate.opsForValue().set("key",value);
        return true;
    }
    //删除redis中的值
    public boolean delete(String key,String value){
        redisTemplate.delete(key);
        return true;
    }
}
