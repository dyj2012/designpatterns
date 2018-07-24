package com.duyj.designpatterns.behavior.middleclass.mediator;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public abstract class Country {
    protected WTO wto;

    public Country(WTO wto) {
        this.wto = wto;
    }

    public abstract void sell();

    public abstract void receive(String obj);
}
