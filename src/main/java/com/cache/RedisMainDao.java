package com.cache;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/5/13 20:56
 */
@Service
public class RedisMainDao {
    @Resource
    private RedisTemplate<Object,String> redisTemplate;

    private void addThread(){
        

    }


}
