package com.wyf.model.vo;

/**
*@author weiyifei
*@description 用来保存树根信息
*@date 2023/1/25
*/
public class TreeRoot {

    private Long treeId;

    private Long treeRootNodeId;

    private String treeName;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
