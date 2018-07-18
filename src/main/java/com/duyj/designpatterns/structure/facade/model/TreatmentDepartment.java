package com.duyj.designpatterns.structure.facade.model;

/**
 * 看病治疗
 *
 * @author 杜永军
 * @date 2018/07/18
 */
public class TreatmentDepartment {
    public void treat(People p) {
        System.out.println(String.format("%s treating...", p.getName()));
        System.out.println(String.format("%s is ok!", p.getName()));
    }
}
