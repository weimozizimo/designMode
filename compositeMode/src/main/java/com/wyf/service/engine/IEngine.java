package com.wyf.service.engine;

import com.wyf.model.aggregates.TreeRich;
import com.wyf.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String,String> decisionMatter);
}
