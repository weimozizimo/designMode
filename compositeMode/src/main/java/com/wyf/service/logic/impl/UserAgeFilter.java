package com.wyf.service.logic.impl;

import com.wyf.service.logic.BaseLogic;

import java.util.Map;

public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
