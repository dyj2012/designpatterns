package com.duyj.designpatterns.build.builder;

import com.duyj.designpatterns.build.abstractfactory.model.Keyboard;
import com.duyj.designpatterns.build.abstractfactory.model.Mouse;
import com.duyj.designpatterns.build.abstractfactory.model.Screen;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class Computer {

    private Screen screen;
    private Keyboard keyboard;
    private Mouse mouse;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "screen=" + screen.show() +
                ", keyboard=" + keyboard.knock() +
                ", mouse=" + mouse.click() +
                '}';
    }
}
