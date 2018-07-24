package com.duyj.designpatterns.behavior.classstate.memento;

import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class ModelTest {

    @Test
    public void getStateMemento() {
        Model model = new Model();
        model.setState("good");
        Memento stateMemento = model.getStateMemento();
        System.out.println(model);
        model.setState("bad");
        System.out.println(model);
        model.recoveryState(stateMemento);
        System.out.println(model);
    }
}