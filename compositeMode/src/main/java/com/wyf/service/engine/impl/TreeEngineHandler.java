package com.wyf.service.engine.impl;

import com.wyf.model.aggregates.TreeRich;
import com.wyf.model.vo.EngineResult;
import com.wyf.model.vo.TreeNode;
import com.wyf.service.engine.EngineBase;

import java.util.Map;

public class TreeEngineHandler extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        //执行决策操作
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        //组网并返回决策结果
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
