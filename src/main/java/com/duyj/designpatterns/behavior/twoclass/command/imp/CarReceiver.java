package com.duyj.designpatterns.behavior.twoclass.command.imp;

import com.duyj.designpatterns.behavior.twoclass.command.AbstarctReceiver;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public class CarReceiver extends AbstarctReceiver {
    @Override
    public void run() {
        System.out.println("car run");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
