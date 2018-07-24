package com.duyj.designpatterns.behavior.middleclass.mediator;

import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class WTOTest {

    @Test
    public void sell() {
        WTO wto = new WTO();
        wto.init();
        Country china = wto.getChina();
        china.sell();
    }
}