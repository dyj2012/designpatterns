package com.duyj.designpatterns.structure.bridge;

/**
 * 引擎驱动
 *
 * @author 杜永军
 * @date 2018/07/18
 */
public class LogDriveManger {
    private AbstractLogDriver logManager;

    public <T extends AbstractLogDriver> void init(Class<T> cls) {
        try {
            logManager = cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public ILogger getLogger() {
        return logManager.getLogger();
    }


}
