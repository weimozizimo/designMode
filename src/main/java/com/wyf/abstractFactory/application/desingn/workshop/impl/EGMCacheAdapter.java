package com.wyf.abstractFactory.application.desingn.workshop.impl;

import com.wyf.abstractFactory.application.desingn.workshop.ICacheAdapter;
import com.wyf.abstractFactory.application.redis.cluster.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {


    private EGM egm = new EGM();


    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key,value);
    }

    @Override
    public void set(String key, String value, long timout, TimeUnit timeUnit) {
        egm.setEx(key, value, timout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
