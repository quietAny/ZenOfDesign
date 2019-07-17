package com.cz.zenofdesign.part2.chapter9.abstractfactory;

/**
 * @ClassName: AbstractCreator
 * @date: 2019/7/10  10:26
 * @author: guohao
 * @Description: 抽象工厂类
 */
public abstract class AbstractCreator {

    public abstract AbstractProductA createAbstractProductA();

    public abstract AbstractProductB createAbstractProductB();
}
