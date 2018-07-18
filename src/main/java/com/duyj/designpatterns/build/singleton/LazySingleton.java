package com.duyj.designpatterns.build.singleton;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getIntance() {
        //局部变量可以提高25%的性能，这个局部变量确保instance只在已经被初始化的情况下读取一次
        // 否则判空时,return时至少需要读取两次
        LazySingleton result = instance;
        if (result == null) {
            synchronized (LazySingleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new LazySingleton();
                }
            }
        }
        return result;
    }
}
