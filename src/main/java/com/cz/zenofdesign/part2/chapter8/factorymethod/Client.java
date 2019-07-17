package com.cz.zenofdesign.part2.chapter8.factorymethod;

/**
 * @ClassName: Client
 * @date: 2019/7/10  9:59
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();
    }
}
