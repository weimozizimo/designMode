package com.wyf.model.vo;

/**
*@author weiyifei
*@description 用来描述节点与节点之间的连接
*@date 2023/1/25
*/
public class TreeNodeLink {

    private Long nodeIdFrom;

    private Long nodeIdTo;

    private Integer ruleLimitType; //限定类型； 1:=;2:>3:<;4:>=;5:<=;

    private String ruleLimitValue; //限定值

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public Integer getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(Integer ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }
}
