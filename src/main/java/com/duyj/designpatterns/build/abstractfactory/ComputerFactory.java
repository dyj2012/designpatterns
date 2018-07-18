package com.duyj.designpatterns.build.abstractfactory;

import com.duyj.designpatterns.build.abstractfactory.model.Keyboard;
import com.duyj.designpatterns.build.abstractfactory.model.Mouse;
import com.duyj.designpatterns.build.abstractfactory.model.Screen;

/**
 * @author 杜永军
 * @date 2018/07/11
 */
public interface ComputerFactory {

    Screen createScreen();

    Mouse createMouse();

    Keyboard createKeyboard();
}

