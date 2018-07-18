package com.duyj.designpatterns.structure.facade;

import com.duyj.designpatterns.structure.facade.model.People;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 杜永军
 * @date 2018/07/18
 */
public class HospitalFacadeTest {

    @Test
    public void seeTheDoctor() {
        HospitalFacade hospitalFacade = new HospitalFacade();
        People people = new People();
        people.setName("karl");
        hospitalFacade.seeTheDoctor(people);
    }
}