package com.duyj.designpatterns.structure.adapter.interfaceadapter;

import com.duyj.designpatterns.structure.adapter.IMessageService;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public abstract class AbstractMessageService implements IMessageService {


    @Override
    public void dealMessageHead() {
        System.out.println("can not deal message head...");
    }

    @Override
    public void dealMessageBody() {
        System.out.println("no message to deal...");
    }
}
