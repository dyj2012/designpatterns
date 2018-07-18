package com.duyj.designpatterns.structure.facade;

import com.duyj.designpatterns.structure.facade.model.PaymentDepartment;
import com.duyj.designpatterns.structure.facade.model.People;
import com.duyj.designpatterns.structure.facade.model.RegisterDepartment;
import com.duyj.designpatterns.structure.facade.model.TreatmentDepartment;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class HospitalFacade {
    private RegisterDepartment registerDepartment = new RegisterDepartment();
    private TreatmentDepartment treatmentDepartment = new TreatmentDepartment();
    private PaymentDepartment paymentDepartment = new PaymentDepartment();


    public void seeTheDoctor(People p) {
        System.out.println(String.format("%s into hospital...", p.getName()));
        registerDepartment.register(p);
        paymentDepartment.payment(p);
        treatmentDepartment.treat(p);
        System.out.println(String.format("%s out hospital...", p.getName()));
    }
}
