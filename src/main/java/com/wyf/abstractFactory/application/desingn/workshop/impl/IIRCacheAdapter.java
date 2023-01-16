package com.wyf.abstractFactory.application.desingn.workshop.impl;

import com.wyf.abstractFactory.application.desingn.workshop.ICacheAdapter;
import com.wyf.abstractFactory.application.redis.cluster.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {

    IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
