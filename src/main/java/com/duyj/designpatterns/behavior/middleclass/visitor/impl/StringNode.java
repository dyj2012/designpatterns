package com.duyj.designpatterns.behavior.middleclass.visitor.impl;

import com.duyj.designpatterns.behavior.middleclass.visitor.Node;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class StringNode extends Node {
    String str;

    public StringNode(String str) {
        this.str = str;
    }

    @Override
    public void print() {
        System.out.println("string:" + str);
    }

    @Override
    public void join(StringBuilder sb) {
        sb.append(str);
    }
}
