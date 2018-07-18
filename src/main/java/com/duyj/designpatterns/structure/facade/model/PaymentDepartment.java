package com.duyj.designpatterns.structure.facade.model;

/**
 * 缴费
 *
 * @author 杜永军
 * @date 2018/07/18
 */
public class PaymentDepartment {
    public void payment(People p) {
        System.out.println(String.format("%s payment...", p.getName()));
    }
}
