package com.duyj.designpatterns.behavior.middleclass.mediator;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class English extends Country {
    public English(WTO wto) {
        super(wto);
    }

    @Override
    public void sell() {
        super.wto.sell("car");
    }

    @Override
    public void receive(String obj) {
        System.out.println("English receive " + obj);
    }
}
