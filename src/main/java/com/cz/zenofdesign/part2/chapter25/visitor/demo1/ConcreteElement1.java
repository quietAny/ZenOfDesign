package com.cz.zenofdesign.part2.chapter25.visitor.demo1;

/**
 * @ClassName: ConcreteElement1
 * @date: 2019/7/12  14:09
 * @author: guohao
 * @Description:
 */
public class ConcreteElement1 extends Element{
    @Override
    public void doSomethng() {
        System.out.println("处理业务1的逻辑");
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
