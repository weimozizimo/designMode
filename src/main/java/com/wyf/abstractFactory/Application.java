package com.wyf.abstractFactory;

import com.wyf.abstractFactory.application.CacheService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        CacheService bean = run.getBean(CacheService.class);
        bean.set("myname","weiyifei");


    }

}
