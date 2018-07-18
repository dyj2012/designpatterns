package com.duyj.designpatterns.build.singleton;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
