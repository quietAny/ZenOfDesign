package com.cz.zenofdesign.part2.chapter25.visitor.demo1;

/**
 * @ClassName: IVisitor
 * @date: 2019/7/12  14:04
 * @author: guohao
 * @Description:
 */
public interface  IVisitor {

    public void visit(ConcreteElement1 c1);
    public void visit(ConcreteElement2 c2);
}
