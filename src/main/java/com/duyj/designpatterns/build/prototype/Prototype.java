package com.duyj.designpatterns.build.prototype;

import java.io.*;

/**
 * @author 杜永军
 * @date 2018/07/13
 */
public class Prototype implements Cloneable, Serializable {

    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "a='" + a + '\'' +
                '}';
    }

    public Prototype clonePrototype() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public Prototype deepClonePrototype() throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                return (Prototype) ois.readObject();
            }
        }
    }
}
