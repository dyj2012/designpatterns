package com.duyj.designpatterns.build.abstractfactory.model.lenovo;

import com.duyj.designpatterns.build.abstractfactory.model.Keyboard;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class LenovoKeyboard extends Keyboard {
    @Override
    public String knock() {
        return "lenovo 3.2 keyboard";
    }
}
