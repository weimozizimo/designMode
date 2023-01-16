package com.wyf.abstractFactory.application.redis.cluster;

import com.wyf.abstractFactory.application.redis.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class EGM {

    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String,String> dataMap = new ConcurrentHashMap<String,String>();

    public String gain(String key){
        logger.info("EGM获取数据 key {}",key);
        return dataMap.get(key);
    }

    public void set(String key,String value){
        logger.info("EGM写入数据 key {} value {}",key,value);
        dataMap.put(key,value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit){
        logger.info("EGM写入数据 key {} value {} timeout {} timeUnit {}",key,value,timeout,timeUnit.toString());
        dataMap.put(key,value);
    }

    public void delete(String key){
        logger.info("EGM 删除数据 key {}",key);
        dataMap.remove(key);
    }


}
