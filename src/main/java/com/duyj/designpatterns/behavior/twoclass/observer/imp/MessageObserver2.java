package com.duyj.designpatterns.behavior.twoclass.observer.imp;

import com.duyj.designpatterns.behavior.twoclass.observer.MessageObserver;
import com.duyj.designpatterns.behavior.twoclass.observer.model.Message;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public class MessageObserver2 implements MessageObserver {
    @Override
    public void messagePut(Message message) {
        System.out.println("MessageObserver2 receive message:" + message);
    }
}
