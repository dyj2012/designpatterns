package com.duyj.designpatterns.structure.decorater;

import com.duyj.designpatterns.structure.decorater.model.TV;

/**
 * @author 杜永军
 * @date 2018/07/17
 */
public class TVRepairtorDecorater {
    Repairtor repairtor;

    public TVRepairtorDecorater(Repairtor repairtor) {
        this.repairtor = repairtor;
    }

    public void repairTV(TV tv) {
        System.out.println("repairing TV");
        repairtor.repair(tv);
        System.out.println("repair TV finish");
        tv.setRepairCount(tv.getRepairCount() + 1);
    }
}
