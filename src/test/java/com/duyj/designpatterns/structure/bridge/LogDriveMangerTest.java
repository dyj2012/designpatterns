package com.duyj.designpatterns.structure.bridge;

import com.duyj.designpatterns.structure.bridge.file.FileLogDriver;
import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class LogDriveMangerTest {

    @Test
    public void getLogger() {
        LogDriveManger logDriveManger = new LogDriveManger();
        logDriveManger.init(FileLogDriver.class);
        ILogger logger = logDriveManger.getLogger();
        logger.log("my log");
    }
}