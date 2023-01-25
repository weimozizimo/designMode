package com.wyf.abstractFactory.application.config;

import com.wyf.abstractFactory.application.CacheService;
import com.wyf.abstractFactory.application.CacheServiceImpl;
import com.wyf.abstractFactory.application.desingn.factory.JDKProxyFactory;
import com.wyf.abstractFactory.application.desingn.workshop.impl.EGMCacheAdapter;
import com.wyf.abstractFactory.application.desingn.workshop.impl.IIRCacheAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;
import java.lang.reflect.InvocationTargetException;

@Configuration
public class CacheConfig {

    @Value("${cache.type:single}")
    private String cacheType;

    @Bean
    public CacheService cacheService() throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Class adapterClazz = EGMCacheAdapter.class;

        switch (cacheType){
            case "egm":
                adapterClazz = EGMCacheAdapter.class;
                break;
            case "iir":
                adapterClazz = IIRCacheAdapter.class;
                break;
            case "single":
                return new CacheServiceImpl();
        }

        return (CacheService) JDKProxyFactory.getProxy(CacheService.class,adapterClazz);
    }

}
