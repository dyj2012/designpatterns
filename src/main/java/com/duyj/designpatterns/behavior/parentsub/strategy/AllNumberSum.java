package com.duyj.designpatterns.behavior.parentsub.strategy;

import java.util.List;

/**
 * @author 杜永军
 * @date 2018/07/19
 */
public class AllNumberSum extends AbstractSumStrategy {
    @Override
    public int sum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }
}
