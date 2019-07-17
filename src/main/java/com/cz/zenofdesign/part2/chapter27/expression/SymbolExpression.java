package com.cz.zenofdesign.part2.chapter27.expression;

import java.util.HashMap;

/**
 * @ClassName: SymbolExpression
 * @date: 2019/7/15  9:16
 * @author: guohao
 * @Description: 抽象运算符号解析器
 */
public abstract class SymbolExpression extends Expression{

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
