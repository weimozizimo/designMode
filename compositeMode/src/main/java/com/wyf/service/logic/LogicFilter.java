package com.wyf.service.logic;

import com.wyf.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
*@author weiyifei
*@description 逻辑决策接口
*@date 2023/1/25
*/
public interface LogicFilter {


    /**
     *
     * @param matterValue: 决策值
     * @param treeNodeLineInfoList: 决策节点
     * @return java.lang.Long 下一个节点id
     * @description 逻辑决策器，用于决策下一个节点是哪个
     * @date 2023/1/25
     * @author weiyifei
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     *
     * @param treeId:
     * @param userId:
     * @param decisionMatter:
     * @return java.lang.String
     * @description 获取决策值
     * @date 2023/1/25
     * @author weiyifei
     */
    String matterValue(Long treeId, String userId, Map<String,String> decisionMatter);

}
