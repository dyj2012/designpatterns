package com.duyj.designpatterns.structure.decorater;

import com.duyj.designpatterns.structure.decorater.model.Stateable;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class Repairtor {

    public void repair(Stateable stateable) {
        System.out.println("repairing...");
        stateable.setState("ok");
    }
}
