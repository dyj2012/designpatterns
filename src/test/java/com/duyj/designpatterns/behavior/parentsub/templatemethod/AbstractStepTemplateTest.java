package com.duyj.designpatterns.behavior.parentsub.templatemethod;

import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/19
 */
public class AbstractStepTemplateTest {

    @Test
    public void doStep() {
        AbstractStepTemplate step = new SomeStep();
        step.doStep();
    }
}