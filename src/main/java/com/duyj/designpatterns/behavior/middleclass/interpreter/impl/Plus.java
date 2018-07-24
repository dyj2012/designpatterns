package com.duyj.designpatterns.behavior.middleclass.interpreter.impl;

import com.duyj.designpatterns.behavior.middleclass.interpreter.Context;
import com.duyj.designpatterns.behavior.middleclass.interpreter.Expression;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class Plus extends Expression {
    @Override
    public void interpret(Context context) {
        context.setResult(context.getNum1() + context.getNum2());
    }
}
