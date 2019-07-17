package com.cz.zenofdesign.part2.chapter8.factorymethod;

/**
 * @ClassName: Creator
 * @date: 2019/7/10  9:54
 * @author: guohao
 * @Description: 抽象工厂类
 */
public abstract class Creator {

    /**
     * 创建一个产品对象
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);

}
