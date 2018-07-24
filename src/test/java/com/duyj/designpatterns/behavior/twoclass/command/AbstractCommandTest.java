package com.duyj.designpatterns.behavior.twoclass.command;

import com.duyj.designpatterns.behavior.twoclass.command.imp.CarReceiver;
import com.duyj.designpatterns.behavior.twoclass.command.imp.RunCommand;
import com.duyj.designpatterns.behavior.twoclass.command.imp.StopCommand;
import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public class AbstractCommandTest {

    @Test
    public void action() {
        CarReceiver receiver = new CarReceiver();
        AbstractCommand runCommand = new RunCommand(receiver);
        AbstractCommand stopCommand = new StopCommand(receiver);
        runCommand.action();
        stopCommand.action();
    }
}