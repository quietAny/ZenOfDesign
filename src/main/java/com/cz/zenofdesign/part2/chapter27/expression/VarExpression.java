package com.cz.zenofdesign.part2.chapter27.expression;

import java.util.HashMap;

/**
 * @ClassName: VarExpression
 * @date: 2019/7/15  9:11
 * @author: guohao
 * @Description: 变量解析器
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
