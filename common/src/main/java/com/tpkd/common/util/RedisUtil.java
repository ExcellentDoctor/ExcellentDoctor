package com.tpkd.common.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author jyk
 */
@Component
public class RedisUtil {
    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 获取redis中元素
     * @param key
     * @return
     */
    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }


    /**
     * 添加redis值有超时
     * @param key
     * @param value
     * @return
     */
    public  boolean setHasTimeOut(String key,Object value,Integer timeOut){
        redisTemplate.opsForValue().set(key,value,timeOut, TimeUnit.MINUTES);
        return true;
    }

    /**
     * 添加redis值有超时
     * @param key
     * @param value
     * @return
     */
    public  boolean setForever(String key,Object value){
        redisTemplate.opsForValue().set(key,value);
        return true;
    }


    /**
     * 删除redis中的值
     * @param key
     * @param value
     * @return
     */

    public boolean delete(String key,String value){
        redisTemplate.delete(key);
        return true;
    }


    public boolean isexist(String key) {
        try {
            if (redisTemplate.hasKey(key)){
                return true;
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }

}
