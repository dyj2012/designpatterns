package com.duyj.designpatterns.behavior.twoclass.observer.imp;

import com.duyj.designpatterns.behavior.twoclass.observer.model.Message;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public class MyMessageSubject extends AbstractMessageSubject {

    @Override
    public void putMessage(Message message) {
        super.notifyObserver(message);
    }
}
