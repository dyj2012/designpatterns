package com.duyj.designpatterns.structure.proxy.dynamicproxy;

import com.duyj.designpatterns.structure.proxy.IRunner;
import com.duyj.designpatterns.structure.proxy.staticproxy.Runner;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class RunnerCglibProxy implements MethodInterceptor {
    Runner runner = new Runner();

    public static IRunner getRunner() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Runner.class);
        enhancer.setCallback(new RunnerCglibProxy());
        return (IRunner) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("run".equals(method.getName())) {
            System.out.println("Cglib Proxy prepare run..,");
            runner.run();
            System.out.println("Cglib Proxy run finish...");
        }
        return null;
    }
}
