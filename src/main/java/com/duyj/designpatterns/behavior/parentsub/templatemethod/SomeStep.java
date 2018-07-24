package com.duyj.designpatterns.behavior.parentsub.templatemethod;

/**
 * @author 杜永军
 * @date 2018/07/19
 */
public class SomeStep extends AbstractStepTemplate {
    @Override
    void step2() {
        System.out.println("sub imp step2...");
    }

    @Override
    void step4() {
        System.out.println("sub imp step4...");
    }
}
