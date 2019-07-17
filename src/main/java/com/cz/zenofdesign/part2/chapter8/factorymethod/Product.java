package com.cz.zenofdesign.part2.chapter8.factorymethod;

/**
 * @ClassName: Product
 * @date: 2019/7/10  9:50
 * @author: guohao
 * @Description: 抽象产品类
 */
public abstract class Product {

    /**
     * 公共方法
     */
    public void method1(){
        System.out.println("业务逻辑");
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
