package com.wyf.abstractFactory.application.desingn.workshop;

import java.util.concurrent.TimeUnit;

public interface ICacheAdapter {

    String get(String key);

    void set(String key,String value);

    void set(String key, String value, long timout, TimeUnit timeUnit);

    void del(String key);
}
