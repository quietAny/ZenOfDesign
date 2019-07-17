package com.cz.zenofdesign.part2.chapter8.factorymethod;

/**
 * @ClassName: ConcreteCreator
 * @date: 2019/7/10  9:57
 * @author: guohao
 * @Description: 具体工厂类
 */
public class ConcreteCreator extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        Product product = null;

        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
