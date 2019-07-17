package com.cz.zenofdesign.part2.chapter10.templatemethod;

/**
 * @ClassName: ConcreteClassA
 * @date: 2019/7/10  10:47
 * @author: guohao
 * @Description:
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClassA业务逻辑");
    }

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClassA业务逻辑");
    }
}
