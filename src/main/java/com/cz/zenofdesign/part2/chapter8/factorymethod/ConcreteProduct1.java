package com.cz.zenofdesign.part2.chapter8.factorymethod;

/**
 * @ClassName: ConcreteProduct1
 * @date: 2019/7/10  9:52
 * @author: guohao
 * @Description: 具体产品类
 */
public class ConcreteProduct1 extends Product{
    @Override
    public void method2() {
        System.out.println("业务逻辑处理");
    }
}
