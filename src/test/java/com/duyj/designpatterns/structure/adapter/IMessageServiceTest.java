package com.duyj.designpatterns.structure.adapter;

import com.duyj.designpatterns.structure.adapter.classadapter.MessageServiceImpl;
import com.duyj.designpatterns.structure.adapter.interfaceadapter.MessageBodyWrapper;
import com.duyj.designpatterns.structure.adapter.objectadapter.MessageServiceAdapter;
import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class IMessageServiceTest {

    @Test
    public void classAdapterTest() {
        IMessageService iMessageService = new MessageServiceImpl();
        iMessageService.dealMessageHead();
        iMessageService.dealMessageBody();
    }

    @Test
    public void objectAdapterTest() {
        IMessageService iMessageService = new MessageServiceAdapter();
        iMessageService.dealMessageHead();
        iMessageService.dealMessageBody();
    }

    @Test
    public void interfaceAdapterTest() {
        IMessageService iMessageService  = new MessageBodyWrapper();
        iMessageService.dealMessageHead();
        iMessageService.dealMessageBody();
    }

}