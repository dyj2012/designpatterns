package com.duyj.designpatterns.structure.decorater.model;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class TV extends Stateable {
    private String name;

    private int repairCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepairCount() {
        return repairCount;
    }

    public void setRepairCount(int repairCount) {
        this.repairCount = repairCount;
    }

    public void printInfo() {
        System.out.println(String.format("I am %s, i was %s ,repair %s", name, super.getState(), repairCount));
    }
}
