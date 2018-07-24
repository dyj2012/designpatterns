package com.duyj.designpatterns.behavior.middleclass.visitor;

import com.duyj.designpatterns.behavior.middleclass.visitor.impl.IntNode;
import com.duyj.designpatterns.behavior.middleclass.visitor.impl.JoinVisitor;
import com.duyj.designpatterns.behavior.middleclass.visitor.impl.PrintVisitor;
import com.duyj.designpatterns.behavior.middleclass.visitor.impl.StringNode;
import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class NodeCollectionTest {

    @Test
    public void test() {
        NodeCollection nodeCollection = new NodeCollection();
        nodeCollection.addNode(new IntNode(1));
        nodeCollection.addNode(new IntNode(2));
        nodeCollection.addNode(new IntNode(3));
        nodeCollection.addNode(new StringNode("a"));
        nodeCollection.addNode(new StringNode("b"));
        nodeCollection.addNode(new StringNode("c"));
        nodeCollection.action(new PrintVisitor());
        JoinVisitor joinVisitor = new JoinVisitor();
        nodeCollection.action(joinVisitor);
        joinVisitor.print();
    }
}