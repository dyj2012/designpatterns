package com.duyj.designpatterns.behavior.middleclass.interpreter;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class Context {
    int num1, num2;
    int result;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

}
