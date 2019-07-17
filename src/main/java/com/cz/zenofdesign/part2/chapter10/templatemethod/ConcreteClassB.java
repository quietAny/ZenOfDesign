package com.cz.zenofdesign.part2.chapter10.templatemethod;

/**
 * @ClassName: ConcreteClassB
 * @date: 2019/7/10  10:47
 * @author: guohao
 * @Description:
 */
public class ConcreteClassB extends AbstractClass {

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClassB业务逻辑");
    }

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClassB业务逻辑");
    }
}
