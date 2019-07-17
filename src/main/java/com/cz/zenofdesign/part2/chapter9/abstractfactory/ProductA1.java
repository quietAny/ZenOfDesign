package com.cz.zenofdesign.part2.chapter9.abstractfactory;

/**
 * @ClassName: ProductA1
 * @date: 2019/7/10  10:21
 * @author: guohao
 * @Description: 产品A1实现类
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println("实现产品A1的业务");
    }
}
