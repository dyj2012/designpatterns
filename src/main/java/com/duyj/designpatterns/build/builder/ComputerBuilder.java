package com.duyj.designpatterns.build.builder;

import com.duyj.designpatterns.build.abstractfactory.ComputerFactory;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class ComputerBuilder {

    private ComputerFactory computerFactory;

    public ComputerBuilder(ComputerFactory computerFactory) {
        this.computerFactory = computerFactory;
    }

    public Computer create() {
        Computer computer = new Computer();
        computer.setScreen(computerFactory.createScreen());
        computer.setKeyboard(computerFactory.createKeyboard());
        computer.setMouse(computerFactory.createMouse());
        return computer;
    }
}
