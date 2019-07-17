package com.cz.zenofdesign.part2.chapter9.abstractfactory;

/**
 * @ClassName: AbstractProductA
 * @date: 2019/7/10  10:19
 * @author: guohao
 * @Description: 抽象产品A
 */
public abstract class AbstractProductA {

    public void method(){
        System.out.println("公有的方法");
    }

    public abstract void doSomething();
}
