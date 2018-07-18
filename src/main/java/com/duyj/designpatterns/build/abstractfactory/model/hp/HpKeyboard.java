package com.duyj.designpatterns.build.abstractfactory.model.hp;


import com.duyj.designpatterns.build.abstractfactory.model.Keyboard;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class HpKeyboard extends Keyboard {
    @Override
    public String knock() {
        return "hp 3.2 keyboard";
    }
}
