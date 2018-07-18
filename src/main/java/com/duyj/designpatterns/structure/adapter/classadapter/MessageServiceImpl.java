package com.duyj.designpatterns.structure.adapter.classadapter;

import com.duyj.designpatterns.structure.adapter.IMessageService;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class MessageServiceImpl extends HeadMessageHelper implements IMessageService {

    @Override
    public void dealMessageBody() {
        System.out.println("service deal message body...");
    }
}
