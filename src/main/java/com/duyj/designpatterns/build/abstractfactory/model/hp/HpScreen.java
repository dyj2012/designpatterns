package com.duyj.designpatterns.build.abstractfactory.model.hp;

import com.duyj.designpatterns.build.abstractfactory.model.Screen;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class HpScreen extends Screen {
    @Override
    public String show() {
        return "hp 1080p screen";
    }
}
