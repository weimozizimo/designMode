package com.wyf.abstractFactory.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSercvice {

    Logger log = LoggerFactory.getLogger(TestSercvice.class);



    public void test(){
        log.info("hello test");
    }
}
