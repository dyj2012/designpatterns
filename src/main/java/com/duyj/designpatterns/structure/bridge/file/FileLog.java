package com.duyj.designpatterns.structure.bridge.file;

import com.duyj.designpatterns.structure.bridge.ILogger;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class FileLog implements ILogger {

    @Override
    public void log(String msg) {
        System.out.println("log into file: " + msg);
    }
}
