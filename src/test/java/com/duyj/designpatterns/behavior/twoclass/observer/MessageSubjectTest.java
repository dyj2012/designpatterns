package com.duyj.designpatterns.behavior.twoclass.observer;

import com.duyj.designpatterns.behavior.twoclass.observer.imp.MessageObserver1;
import com.duyj.designpatterns.behavior.twoclass.observer.imp.MessageObserver2;
import com.duyj.designpatterns.behavior.twoclass.observer.imp.MyMessageSubject;
import com.duyj.designpatterns.behavior.twoclass.observer.model.Message;
import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/19
 */
public class MessageSubjectTest {

    @Test
    public void putMessage() {
        Message message = new Message();
        message.setName("Job");
        message.setContext("I was sleeping");
        MessageSubject mssageSubject = this.getMssageSubject();
        mssageSubject.putMessage(message);
    }

    private MessageSubject getMssageSubject() {
        MessageSubject messageSubject = new MyMessageSubject();
        messageSubject.addObserver(new MessageObserver1());
        messageSubject.addObserver(new MessageObserver2());
        return messageSubject;
    }
}