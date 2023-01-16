package com.wyf.abstractFactory.application.test;


import com.wyf.abstractFactory.application.CacheService;
import com.wyf.abstractFactory.application.CacheServiceImpl;
import com.wyf.abstractFactory.application.desingn.factory.JDKProxyFactory;
import com.wyf.abstractFactory.application.desingn.util.ClassLoaderUtils;
import com.wyf.abstractFactory.application.desingn.workshop.impl.EGMCacheAdapter;
import com.wyf.abstractFactory.application.desingn.workshop.impl.IIRCacheAdapter;
import com.wyf.abstractFactory.application.redis.RedisUtils;

import javax.security.auth.callback.CallbackHandler;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);

        proxy_EGM.set("myName","weiyifei");

        CacheService proxy_IIR = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);

        proxy_IIR.set("MyName","zimo");

    }
}
