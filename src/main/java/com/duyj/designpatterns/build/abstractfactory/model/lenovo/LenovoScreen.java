package com.duyj.designpatterns.build.abstractfactory.model.lenovo;

import com.duyj.designpatterns.build.abstractfactory.model.Screen;

/**
 * @author 杜永军
 * @date 2018/07/12
 */
public class LenovoScreen extends Screen {
    @Override
    public String show() {
        return "lenovo 720p screen";
    }
}
