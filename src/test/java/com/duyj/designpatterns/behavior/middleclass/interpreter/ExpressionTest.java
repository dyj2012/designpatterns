package com.duyj.designpatterns.behavior.middleclass.interpreter;

import com.duyj.designpatterns.behavior.middleclass.interpreter.impl.Minus;
import com.duyj.designpatterns.behavior.middleclass.interpreter.impl.Plus;
import org.junit.Test;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/24
 */
public class ExpressionTest {

    @Test
    public void interpret() {
        // 100 + 99 -98
        Expression plus = new Plus();
        Expression minus = new Minus();
        Context context = new Context(100, 99);
        plus.interpret(context);
        Context context1 = new Context(context.getResult(), 98);
        minus.interpret(context1);
        System.out.println(context1.getResult());
    }
}