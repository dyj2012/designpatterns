package com.duyj.designpatterns.structure.facade.model;

/**
 * 挂号部
 *
 * @author 杜永军
 * @date 2018/07/18
 */
public class RegisterDepartment {

    public void register(People p) {
        System.out.println(String.format("%s register...", p.getName()));
    }
}
