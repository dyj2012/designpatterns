package com.duyj.designpatterns.structure.adapter.objectadapter;

import com.duyj.designpatterns.structure.adapter.IMessageService;
import com.duyj.designpatterns.structure.adapter.classadapter.HeadMessageHelper;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class MessageServiceAdapter implements IMessageService {

    HeadMessageHelper headMessageHelper = new HeadMessageHelper();

    @Override
    public void dealMessageHead() {
        headMessageHelper.dealMessageHead();
    }

    @Override
    public void dealMessageBody() {
        System.out.println("adapter deal message body...");
    }
}
