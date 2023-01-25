package com.wyf.model.aggregates;

import com.wyf.model.vo.TreeNode;
import com.wyf.model.vo.TreeRoot;

import java.util.Map;

/**
*@author weiyifei
*@description 规则树聚合
*@date 2023/1/25
*/
public class TreeRich {

    private TreeRoot treeRoot;              //树根节点

    private Map<Long, TreeNode> treeNodeMap; //树节点id->子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
