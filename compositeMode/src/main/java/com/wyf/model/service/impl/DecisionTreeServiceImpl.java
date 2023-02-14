package com.wyf.model.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wyf.model.entity.DecisionTree;
import com.wyf.model.mapper.DecisionTreeMapper;
import com.wyf.model.service.DecisionTreeService;
import org.springframework.stereotype.Service;

@Service
public class DecisionTreeServiceImpl extends ServiceImpl<DecisionTreeMapper,DecisionTree> implements DecisionTreeService {

}
