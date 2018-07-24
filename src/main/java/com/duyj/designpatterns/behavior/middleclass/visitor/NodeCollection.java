package com.duyj.designpatterns.behavior.middleclass.visitor;

import java.util.Vector;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class NodeCollection {

    private Vector<Node> vector;

    public NodeCollection() {
        vector = new Vector<>(10);
    }

    public void action(AbstractVisitor visitor) {
        for (Node node : vector) {
            node.accept(visitor);
        }
    }

    public void addNode(Node node) {
        vector.add(node);
    }

}
