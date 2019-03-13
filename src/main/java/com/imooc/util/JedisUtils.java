package com.imooc.util;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by tl on 2019/3/5.
 */
@Component
public class JedisUtils {

    static JedisPool jedisPool = new JedisPool();

    public static Jedis getJedis(){
        return jedisPool.getResource();

    }


}
