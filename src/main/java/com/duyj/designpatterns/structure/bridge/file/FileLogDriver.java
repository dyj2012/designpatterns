package com.duyj.designpatterns.structure.bridge.file;

import com.duyj.designpatterns.structure.bridge.AbstractLogDriver;
import com.duyj.designpatterns.structure.bridge.ILogger;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class FileLogDriver extends AbstractLogDriver {

    @Override
    public ILogger getLogger() {
        return new FileLog();
    }
}
