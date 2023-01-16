package com.wyf.abstractFactory.application.desingn.factory;

import com.wyf.abstractFactory.application.desingn.util.ClassLoaderUtils;
import com.wyf.abstractFactory.application.desingn.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JdkInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter,args);
    }
}
