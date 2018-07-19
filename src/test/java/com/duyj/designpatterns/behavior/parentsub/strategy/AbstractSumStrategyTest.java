package com.duyj.designpatterns.behavior.parentsub.strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author 杜永军
 * @date 2018/07/19
 */
public class AbstractSumStrategyTest {

    @Test
    public void sum() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(new EvenNumberSum().sum(list));
        System.out.println(new OddNumberSum().sum(list));
        System.out.println(new AllNumberSum().sum(list));
    }
}