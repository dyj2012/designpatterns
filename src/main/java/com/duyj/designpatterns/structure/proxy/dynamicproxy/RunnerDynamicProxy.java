package com.duyj.designpatterns.structure.proxy.dynamicproxy;

import com.duyj.designpatterns.structure.proxy.IRunner;
import com.duyj.designpatterns.structure.proxy.staticproxy.Runner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class RunnerDynamicProxy implements InvocationHandler {

    Runner runner = new Runner();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("run".equals(method.getName())) {
            System.out.println("Dynamic Proxy prepare run..,");
            runner.run();
            System.out.println("Dynamic Proxy run finish...");
        }
        return null;
    }


    public static IRunner getRunner() {
        return (IRunner) Proxy.newProxyInstance(Runner.class.getClassLoader(), Runner.class.getInterfaces(), new RunnerDynamicProxy());
    }
}
