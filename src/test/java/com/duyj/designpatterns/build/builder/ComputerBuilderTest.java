package com.duyj.designpatterns.build.builder;

import com.duyj.designpatterns.build.abstractfactory.HpFactory;
import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class ComputerBuilderTest {

    @Test
    public void create() {
        ComputerBuilder computerBuilder = new ComputerBuilder(new HpFactory());
        Computer computer = computerBuilder.create();
        System.out.println(computer);
    }

}