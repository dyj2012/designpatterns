package com.duyj.designpatterns.structure.bridge.db;

import com.duyj.designpatterns.structure.bridge.ILogger;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class DBLog implements ILogger {

    @Override
    public void log(String msg) {
        System.out.println("log into db: " + msg);
    }
}
