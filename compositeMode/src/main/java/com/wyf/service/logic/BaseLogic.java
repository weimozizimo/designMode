package com.wyf.service.logic;

import com.wyf.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public abstract class BaseLogic implements LogicFilter{

    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        for (TreeNodeLink treeNodeLink : treeNodeLineInfoList) {
            if(decisionLogic(matterValue,treeNodeLink)) return treeNodeLink.getNodeIdTo();
        }
        return 0L;
    }

    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    /**
     *
     * @param matterValue: 决策值
     * @param nodeLink: 节点连接对象，用于根据其限定值来判定寻路路径
     * @return boolean
     * @description 用于决策此路径是否可行
     * @date 2023/1/25
     * @author weiyifei
     */
    private boolean decisionLogic(String matterValue,TreeNodeLink nodeLink){
        switch (nodeLink.getRuleLimitType()){
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue)>Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue)<Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue)<=Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue)>=Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
