package com.cz.zenofdesign.part2.chapter27.expression;

import java.util.HashMap;

/**
 * @ClassName: AddExpression
 * @date: 2019/7/15  9:21
 * @author: guohao
 * @Description: 加法解析器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
