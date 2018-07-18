package com.duyj.designpatterns.build.factory.model;

import com.duyj.designpatterns.build.factory.Animal;

/**
 * @author 杜永军
 * @date 2018/07/11
 */
public class Dog implements Animal {
    @Override
    public String getName() {
        return "HappyDog";
    }

    @Override
    public String getVoice() {
        return "wang wang";
    }
}
