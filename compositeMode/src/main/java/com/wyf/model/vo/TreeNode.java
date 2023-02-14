package com.wyf.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;


@TableName("tree_node")
@Accessors(chain = true)
@Data
public class TreeNode {

    private Long treeId; //规则树id

    @TableId(type = IdType.AUTO)
    private Long treeNodeId; //规则树节点id

    private Integer nodeType; //节点类型 1 叶子 2 内容节点

    private String nodeValue; //节点的值[nodeType=2] 有价值的内容值

    private String ruleKey; //规则key 因为有多种规则，所以需要确定这个节点对应的规则的key

    private String ruleDesc; //规则描述

    @TableField(exist = false)
    private List<TreeNodeLink> treeNodeLinkList; //拥有节点链路的集合

}
