package com.imooc.service.impl;

import com.imooc.service.JedisService;
import com.imooc.util.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * Created by tl on 2019/3/5.
 */

@Service
public class JedisServiceImpl implements JedisService {

    @Autowired
    JedisUtils jedisUtils;

    @Override
    public int insert(String key, String value) {

            Jedis jedis = jedisUtils.getJedis();
        try {
            jedis.set(key,value);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            jedis.close();
        }
        return 0;
    }
}
