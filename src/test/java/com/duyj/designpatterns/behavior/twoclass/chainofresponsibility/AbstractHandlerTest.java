package com.duyj.designpatterns.behavior.twoclass.chainofresponsibility;

import com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.imp.AHandler;
import com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.imp.BHandler;
import com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.model.Request;
import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public class AbstractHandlerTest {

    @Test
    public void doHandler() {
        AHandler aHandler = new AHandler();
        aHandler.setNext(new BHandler());
        aHandler.doHandler(new Request());
    }
}