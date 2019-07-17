package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: BMWFactory
 * @date: 2019/7/15  13:14
 * @author: guohao
 * @Description:
 */
public class BMWFactory implements CarFactory {
    @Override
    public ICar createSuv() {
        return new BMWSuv();
    }

    @Override
    public ICar createVan() {
        return new BMWVan();
    }
}
