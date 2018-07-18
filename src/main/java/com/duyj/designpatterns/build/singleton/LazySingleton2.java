package com.duyj.designpatterns.build.singleton;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class LazySingleton2 {

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance() {
        return LazySingletonHolder.INSTANCE;
    }

    private static class LazySingletonHolder {
        private static final LazySingleton2 INSTANCE = new LazySingleton2();
    }
}
