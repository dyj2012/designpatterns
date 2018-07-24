package com.duyj.designpatterns.behavior.middleclass.visitor;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public abstract class Node {

    public void accept(AbstractVisitor visitor) {
        visitor.visit(this);
    }

    public abstract void print();

    public abstract void join(StringBuilder sb);

}
