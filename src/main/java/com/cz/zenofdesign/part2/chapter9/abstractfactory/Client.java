package com.cz.zenofdesign.part2.chapter9.abstractfactory;

/**
 * @ClassName: Client
 * @date: 2019/7/10  10:29
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA productA1 = creator1.createAbstractProductA();

        AbstractProductA productA2 = creator2.createAbstractProductA();

        AbstractProductB productB1 = creator1.createAbstractProductB();

        AbstractProductB productB2 = creator2.createAbstractProductB();

        productA1.doSomething();
        productA2.doSomething();
        productB1.doSomething();
        productB2.doSomething();

     }
}
