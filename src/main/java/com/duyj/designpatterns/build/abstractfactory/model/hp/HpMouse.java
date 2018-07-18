package com.duyj.designpatterns.build.abstractfactory.model.hp;

import com.duyj.designpatterns.build.abstractfactory.model.Mouse;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class HpMouse extends Mouse {
    @Override
    public String click() {
        return "hp 1.5 mouse";
    }
}
