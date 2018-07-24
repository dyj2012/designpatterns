package com.duyj.designpatterns.behavior.twoclass.observer;

import com.duyj.designpatterns.behavior.twoclass.observer.model.Message;

/**
 * 消息主体
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public interface MessageSubject {

    void addObserver(MessageObserver messageObserver);

    void delObserver(MessageObserver messageObserver);

    void notifyObserver(Message message);

    void putMessage(Message message);

}
