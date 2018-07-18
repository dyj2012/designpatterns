package com.duyj.designpatterns.structure.proxy.staticproxy;

import com.duyj.designpatterns.structure.proxy.IRunner;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class RunnerProxy implements IRunner {

    private Runner runner = new Runner();

    @Override
    public void run() {
        System.out.println("prepare run..,");
        runner.run();
        System.out.println("run finish...");
    }
}
