package com.duyj.designpatterns.structure.decorater;

import com.duyj.designpatterns.structure.decorater.model.TV;
import org.junit.Test;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class TVRepairtorDecoraterTest {

    @Test
    public void repairTV() {
        TV tv = new TV();
        tv.setName("TCL TV");
        tv.setState("bad");
        tv.printInfo();
        Repairtor repairtor = new Repairtor();
        TVRepairtorDecorater tvRepairtorDecorater = new TVRepairtorDecorater(repairtor);
        tvRepairtorDecorater.repairTV(tv);
        tv.printInfo();
    }
}