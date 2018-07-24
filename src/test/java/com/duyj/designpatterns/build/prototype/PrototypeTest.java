package com.duyj.designpatterns.build.prototype;

import org.junit.Test;

import java.io.IOException;

/**
 * @author 杜永军
 * @date 2018/07/16
 */
public class PrototypeTest {

    @Test
    public void clonePrototype() {
        Prototype prototype = new Prototype();
        prototype.setA("abc");
        System.out.println(prototype);
        try {
            Prototype clone = prototype.clonePrototype();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void deepClonePrototype() {
        Prototype prototype = new Prototype();
        prototype.setA("cba");
        System.out.println(prototype);
        try {
            Prototype clone = prototype.deepClonePrototype();
            System.out.println(clone);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}