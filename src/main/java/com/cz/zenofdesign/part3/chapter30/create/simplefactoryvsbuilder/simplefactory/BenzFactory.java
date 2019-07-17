package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: BenzFactory
 * @date: 2019/7/15  13:27
 * @author: guohao
 * @Description:
 */
public class BenzFactory implements CarFactory{
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    @Override
    public ICar createVan() {
        return new BenzVan();
    }
}
