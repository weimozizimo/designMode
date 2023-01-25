package com.wyf.service.engine;

import com.wyf.service.logic.LogicFilter;
import com.wyf.service.logic.impl.UserAgeFilter;
import com.wyf.service.logic.impl.UserGenderFilter;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EngineConfig{

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }

    public static Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public static void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        EngineConfig.logicFilterMap = logicFilterMap;
    }
}
