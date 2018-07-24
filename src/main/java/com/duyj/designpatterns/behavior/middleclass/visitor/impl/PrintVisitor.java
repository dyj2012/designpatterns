package com.duyj.designpatterns.behavior.middleclass.visitor.impl;

import com.duyj.designpatterns.behavior.middleclass.visitor.AbstractVisitor;
import com.duyj.designpatterns.behavior.middleclass.visitor.Node;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class PrintVisitor extends AbstractVisitor {
    @Override
    public void visit(Node node) {
        node.print();
    }
}
