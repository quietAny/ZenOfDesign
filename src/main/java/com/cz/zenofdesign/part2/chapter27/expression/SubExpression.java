package com.cz.zenofdesign.part2.chapter27.expression;

import java.util.HashMap;

/**
 * @ClassName: SubExpression
 * @date: 2019/7/15  9:23
 * @author: guohao
 * @Description:
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
