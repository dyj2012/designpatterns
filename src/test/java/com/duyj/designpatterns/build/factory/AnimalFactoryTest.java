package com.duyj.designpatterns.build.factory;

import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class AnimalFactoryTest {

    @Test
    public void buildAnimal() {
        System.out.println(AnimalFactory.buildAnimal("dog").getInfo());
        System.out.println(AnimalFactory.buildAnimal("cat").getInfo());
    }
}