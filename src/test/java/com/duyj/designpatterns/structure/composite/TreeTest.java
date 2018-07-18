package com.duyj.designpatterns.structure.composite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class TreeTest {

    @Test
    public void getRoot() {
        Tree tree = new Tree("MyTree");
        TreeItem root = tree.getRoot();
        TreeItem tree1 = root.addSub("tree1");
        TreeItem tree11 = tree1.addSub("tree11");
        System.out.println(tree);
    }
}