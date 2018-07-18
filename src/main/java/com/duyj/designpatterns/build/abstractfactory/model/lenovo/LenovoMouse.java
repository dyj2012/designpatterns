package com.duyj.designpatterns.build.abstractfactory.model.lenovo;

import com.duyj.designpatterns.build.abstractfactory.model.Mouse;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class LenovoMouse extends Mouse {
    @Override
    public String click() {
        return "lenovo se2.8 mouse";
    }
}
