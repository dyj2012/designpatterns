package com.duyj.designpatterns.build.abstractfactory;

import com.duyj.designpatterns.build.abstractfactory.model.Keyboard;
import com.duyj.designpatterns.build.abstractfactory.model.Mouse;
import com.duyj.designpatterns.build.abstractfactory.model.Screen;
import com.duyj.designpatterns.build.abstractfactory.model.lenovo.LenovoKeyboard;
import com.duyj.designpatterns.build.abstractfactory.model.lenovo.LenovoMouse;
import com.duyj.designpatterns.build.abstractfactory.model.lenovo.LenovoScreen;

/**
 * @author 杜永军
 * @date 2018/07/11
 */
public class LenovoFactory implements ComputerFactory {

    @Override
    public Screen createScreen() {
        return new LenovoScreen();
    }

    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LenovoKeyboard();
    }
}
