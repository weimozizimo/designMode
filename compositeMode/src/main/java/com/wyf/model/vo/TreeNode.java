package com.wyf.model.vo;

import java.util.List;

public class TreeNode {

    private Long treeId; //规则树id

    private Long treeNodeId; //规则树节点id

    private Integer nodeType; //节点类型 1 叶子 2 内容节点

    private String nodeValue; //节点的值[nodeType=2] 有价值的内容值

    private String ruleKey; //规则key 因为有多种规则，所以需要确定这个节点对应的规则的key

    private String ruleDesc; //规则描述

    private List<TreeNodeLink> treeNodeLinkList; //拥有节点链路的集合


    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public List<TreeNodeLink> getTreeNodeLinkList() {
        return treeNodeLinkList;
    }

    public void setTreeNodeLinkList(List<TreeNodeLink> treeNodeLinkList) {
        this.treeNodeLinkList = treeNodeLinkList;
    }
}
