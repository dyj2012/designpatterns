package com.duyj.designpatterns.build.factory;

import com.duyj.designpatterns.build.factory.model.Cat;
import com.duyj.designpatterns.build.factory.model.Dog;

/**
 * @author 杜永军
 * @date 2018/07/11
 */
public class AnimalFactory {

    public static Animal buildAnimal(String type) {
        if (type == null) {
            throw new RuntimeException("动物类型不可为空!");
        }
        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new RuntimeException(String.format("没有找到%s类型动物", type));
        }
    }
}
