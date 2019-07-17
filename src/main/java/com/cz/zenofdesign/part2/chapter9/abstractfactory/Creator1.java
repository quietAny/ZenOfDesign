package com.cz.zenofdesign.part2.chapter9.abstractfactory;

/**
 * @ClassName: Creator1
 * @date: 2019/7/10  10:27
 * @author: guohao
 * @Description: 1类产品工厂实现类
 */
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB1();
    }
}
