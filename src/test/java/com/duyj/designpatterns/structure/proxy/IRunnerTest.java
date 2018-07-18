package com.duyj.designpatterns.structure.proxy;

import com.duyj.designpatterns.structure.proxy.dynamicproxy.RunnerCglibProxy;
import com.duyj.designpatterns.structure.proxy.dynamicproxy.RunnerDynamicProxy;
import com.duyj.designpatterns.structure.proxy.staticproxy.RunnerProxy;
import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class IRunnerTest {

    @Test
    public void staticProxyTest() {
        IRunner iRunner = new RunnerProxy();
        iRunner.run();
    }

    @Test
    public void dynamicProxyTest() {
        IRunner iRunner = RunnerDynamicProxy.getRunner();
        iRunner.run();
    }

    @Test
    public void cglibProxyTest() {
        IRunner iRunner = RunnerCglibProxy.getRunner();
        iRunner.run();
    }
}