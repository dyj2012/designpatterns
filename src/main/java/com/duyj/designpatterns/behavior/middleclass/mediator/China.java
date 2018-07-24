package com.duyj.designpatterns.behavior.middleclass.mediator;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class China extends Country {
    public China(WTO wto) {
        super(wto);
    }

    @Override
    public void sell() {
        super.wto.sell("china");
    }

    @Override
    public void receive(String obj) {
        System.out.println("China receive " + obj);
    }
}
