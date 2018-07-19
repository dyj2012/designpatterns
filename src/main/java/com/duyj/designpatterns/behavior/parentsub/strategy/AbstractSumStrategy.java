package com.duyj.designpatterns.behavior.parentsub.strategy;

import java.util.List;

/**
 * 合计策略
 *
 * @author 杜永军
 * @date 2018/07/18
 */
public abstract class AbstractSumStrategy {

    public abstract int sum(List<Integer> list);
}
