package com.duyj.designpatterns.behavior.middleclass.mediator;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class WTO {
    Country china;
    Country english;
    Country america;

    public void init() {
        china = new China(this);
        english = new English(this);
        america = new America(this);
    }

    public void sell(String obj) {
        china.receive(obj);
        english.receive(obj);
        america.receive(obj);
    }

    public Country getChina() {
        return china;
    }

    public Country getEnglish() {
        return english;
    }

    public Country getAmerica() {
        return america;
    }
}
