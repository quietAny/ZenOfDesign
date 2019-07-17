package com.cz.zenofdesign.part2.chapter9.abstractfactory;

/**
 * @ClassName: Creator2
 * @date: 2019/7/10  10:27
 * @author: guohao
 * @Description: 2类产品工厂实现类
 */
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createAbstractProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createAbstractProductB() {
        return new ProductB2();
    }
}
