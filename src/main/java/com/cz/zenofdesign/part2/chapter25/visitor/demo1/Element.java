package com.cz.zenofdesign.part2.chapter25.visitor.demo1;

/**
 * @ClassName: Element
 * @date: 2019/7/12  14:07
 * @author: guohao
 * @Description:
 */
public abstract class Element {

    public abstract void doSomethng();

    public abstract void accept(IVisitor iVisitor);
}
