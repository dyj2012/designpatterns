package com.duyj.designpatterns.behavior.twoclass.command;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public abstract class AbstractCommand {
    protected AbstarctReceiver receiver;

    public AbstractCommand(AbstarctReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void action();
}
