package com.wyf.abstractFactory.application.desingn.factory;

import com.wyf.abstractFactory.application.desingn.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxyFactory {

    public static <T> T getProxy(Class cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws InstantiationException, IllegalAccessException {
        InvocationHandler handler = new JdkInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        return (T) Proxy.newProxyInstance(classLoader,new Class[]{cacheClazz},handler);
    }

}
