package com.cz.zenofdesign.part2.chapter25.visitor.demo1;

/**
 * @ClassName: Visitor
 * @date: 2019/7/12  14:14
 * @author: guohao
 * @Description:
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 c1) {
        c1.doSomethng();
    }

    @Override
    public void visit(ConcreteElement2 c2) {
        c2.doSomethng();
    }
}
