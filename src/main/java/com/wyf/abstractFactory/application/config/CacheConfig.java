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

@Configuration
public class CacheConfig {

    @Value("${cache.type:egm}")
    private String cacheType;

    @Bean
    public CacheService cacheService() throws InstantiationException, IllegalAccessException {

        Class adapterClazz = EGMCacheAdapter.class;

        switch (cacheType){
            case "egm":
                adapterClazz = EGMCacheAdapter.class;
                break;
            case "iir":
                adapterClazz = IIRCacheAdapter.class;
                break;
        }

        return (CacheService) JDKProxyFactory.getProxy(CacheService.class,adapterClazz);
    }

}
