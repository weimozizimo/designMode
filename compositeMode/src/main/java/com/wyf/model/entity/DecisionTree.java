package com.wyf.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@TableName("decision_tree")
@Data
@Accessors(chain = true)
public class DecisionTree {

    @TableId(type = IdType.AUTO)
    private Integer treeId;

    private String treeName;

    private String remark;

    private Integer rootNodeId;

    private Date createTime;

    private Date updateTime;



}
