package com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.imp;

import com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.AbstractHandler;
import com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.model.Request;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public class AHandler extends AbstractHandler {
    @Override
    protected boolean deal(Request request) {
        System.out.println("a handler pass!");
        return false;
    }
}
