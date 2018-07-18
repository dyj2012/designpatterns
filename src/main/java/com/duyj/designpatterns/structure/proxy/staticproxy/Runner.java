package com.duyj.designpatterns.structure.proxy.staticproxy;

import com.duyj.designpatterns.structure.proxy.IRunner;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class Runner implements IRunner {
    @Override
    public void run() {
        System.out.println("I am running...");
    }
}
