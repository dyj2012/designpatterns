package com.duyj.designpatterns.structure.adapter.interfaceadapter;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class MessageBodyWrapper extends AbstractMessageService {

    @Override
    public void dealMessageBody() {
        System.out.println("body wrapper deal message body..");
    }
}
