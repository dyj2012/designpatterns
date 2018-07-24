package com.duyj.designpatterns.behavior.twoclass.observer;

import com.duyj.designpatterns.behavior.twoclass.observer.model.Message;

/**
 * @author 杜永军
 * @date 2018/07/19
 */
public interface MessageObserver {

    void messagePut(Message message);
}
