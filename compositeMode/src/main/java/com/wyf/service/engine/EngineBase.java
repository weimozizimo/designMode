package com.wyf.service.engine;


import com.wyf.model.aggregates.TreeRich;
import com.wyf.model.vo.TreeNode;
import com.wyf.model.vo.TreeNodeLink;
import com.wyf.model.vo.TreeRoot;
import com.wyf.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
*@author weiyifei
*@description 引擎抽象类，
*@date 2023/1/25
*/
public abstract class EngineBase extends EngineConfig implements IEngine{

    private Logger log = LoggerFactory.getLogger(EngineBase.class);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String,String> decisionMatter){
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        //获取规则树根节点id
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        //获取根节点对象，从根节点开始遍历
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //当获取到果实节点的时候停止循环
        while(treeNodeInfo.getNodeType().equals(1)){
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            log.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }

}
