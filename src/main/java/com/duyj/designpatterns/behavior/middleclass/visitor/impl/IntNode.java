package com.duyj.designpatterns.behavior.middleclass.visitor.impl;

import com.duyj.designpatterns.behavior.middleclass.visitor.Node;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class IntNode extends Node {
    int i;

    public IntNode(int i) {
        this.i = i;
    }

    @Override
    public void print() {
        System.out.println("number:" + i);
    }

    @Override
    public void join(StringBuilder sb) {
        sb.append(i);
    }
}
