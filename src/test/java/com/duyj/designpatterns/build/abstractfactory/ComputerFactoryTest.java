package com.duyj.designpatterns.build.abstractfactory;

import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class ComputerFactoryTest {

    @Test
    public void createComputer() {
        System.out.println(getInfo(new HpFactory()));
        System.out.println(getInfo(new LenovoFactory()));
    }

    public String getInfo(ComputerFactory factory) {
        return String.format("Screen:%s,Keyboard:%s,Mouse:%s", factory.createScreen().show(), factory.createKeyboard().knock(), factory.createMouse().click());
    }
}