package com.duyj.designpatterns.structure.composite;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class Tree {

    private TreeItem root;

    public Tree(String treeName) {
        root = new TreeItem();
        root.setName(treeName);
    }


    public TreeItem getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
