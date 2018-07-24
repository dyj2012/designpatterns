package com.duyj.designpatterns.behavior.classstate.memento;

/**
 * 备忘载体,备忘的对象必须是不可变对象
 * 如果是可变对象,想办法深拷贝一份
 * 在恢复时,如果是可变对象也需要深拷贝一份,否则会污染备份源
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
