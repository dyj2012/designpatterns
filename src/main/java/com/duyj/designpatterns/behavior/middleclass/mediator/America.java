package com.duyj.designpatterns.behavior.middleclass.mediator;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class America extends Country {
    public America(WTO wto) {
        super(wto);
    }

    @Override
    public void sell() {
        super.wto.sell("computer");
    }

    @Override
    public void receive(String obj) {
        System.out.println("America receive " + obj);
    }
}
