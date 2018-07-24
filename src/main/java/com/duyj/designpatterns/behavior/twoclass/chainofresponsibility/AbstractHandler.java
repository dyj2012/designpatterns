package com.duyj.designpatterns.behavior.twoclass.chainofresponsibility;

import com.duyj.designpatterns.behavior.twoclass.chainofresponsibility.model.Request;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public abstract class AbstractHandler {
    AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public void doHandler(Request request) {
        if (!deal(request) && next != null) {
            next.doHandler(request);
        }
    }

    protected abstract boolean deal(Request request);
}
