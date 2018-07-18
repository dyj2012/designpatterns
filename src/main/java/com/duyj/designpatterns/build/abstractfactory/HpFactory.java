package com.duyj.designpatterns.build.abstractfactory;

import com.duyj.designpatterns.build.abstractfactory.model.Keyboard;
import com.duyj.designpatterns.build.abstractfactory.model.Mouse;
import com.duyj.designpatterns.build.abstractfactory.model.Screen;
import com.duyj.designpatterns.build.abstractfactory.model.hp.HpKeyboard;
import com.duyj.designpatterns.build.abstractfactory.model.hp.HpMouse;
import com.duyj.designpatterns.build.abstractfactory.model.hp.HpScreen;

/**
 * @author 杜永军
 * @date 2018/07/11
 */
public class HpFactory implements ComputerFactory {

    @Override
    public Screen createScreen() {
        return new HpScreen();
    }

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
