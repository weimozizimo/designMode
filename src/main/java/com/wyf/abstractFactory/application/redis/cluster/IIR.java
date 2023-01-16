package com.wyf.abstractFactory.application.redis.cluster;

import com.wyf.abstractFactory.application.redis.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class IIR {
    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String,String> dataMap = new ConcurrentHashMap<String,String>();

    public String get(String key){
        logger.info("IIR获取数据 key {}",key);
        return dataMap.get(key);
    }

    public void set(String key,String value){
        logger.info("IIR写入数据 key {} value {}",key,value);
        dataMap.put(key,value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit){
        logger.info("IIR写入数据 key {} value {} timeout {} timeUnit {}",key,value,timeout,timeUnit.toString());
        dataMap.put(key,value);
    }

    public void del(String key){
        logger.info("IIR 删除数据 key {}",key);
        dataMap.remove(key);
    }
}
