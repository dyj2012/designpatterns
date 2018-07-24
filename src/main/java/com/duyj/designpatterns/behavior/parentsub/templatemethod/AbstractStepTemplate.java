package com.duyj.designpatterns.behavior.parentsub.templatemethod;

/**
 * 统计模板
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public abstract class AbstractStepTemplate {
    public void doStep() {
        step1();
        step2();
        step3();
        step4();
    }

    private void step1() {
        System.out.println("step1...");
    }

    abstract void step2();

    private void step3() {
        System.out.println("step3...");
    }

    abstract void step4();
}
