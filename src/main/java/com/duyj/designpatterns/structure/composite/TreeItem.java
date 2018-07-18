package com.duyj.designpatterns.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class TreeItem {
    private String name;
    private List<TreeItem> subList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeItem> getSubList() {
        return subList;
    }

    public void setSubList(List<TreeItem> subList) {
        this.subList = subList;
    }

    public TreeItem addSub(String sunName) {
        TreeItem treeItem = new TreeItem();
        if (subList == null) {
            subList = new ArrayList<>(10);
        }
        subList.add(treeItem);
        return treeItem;
    }

    @Override
    public String toString() {
        return "TreeItem{" +
                "name='" + name + '\'' +
                ", subList=" + subList +
                '}';
    }
}
