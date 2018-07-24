package com.duyj.designpatterns.behavior.twoclass.observer.imp;

import com.duyj.designpatterns.behavior.twoclass.observer.MessageObserver;
import com.duyj.designpatterns.behavior.twoclass.observer.MessageSubject;
import com.duyj.designpatterns.behavior.twoclass.observer.model.Message;

import java.util.Vector;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public abstract class AbstractMessageSubject implements MessageSubject {

    Vector<MessageObserver> vector = new Vector<>(10);

    @Override
    public void addObserver(MessageObserver messageObserver) {
        vector.add(messageObserver);
    }

    @Override
    public void delObserver(MessageObserver messageObserver) {
        vector.remove(messageObserver);
    }

    @Override
    public void notifyObserver(Message message) {
        vector.forEach(n -> n.messagePut(message));
    }


}
