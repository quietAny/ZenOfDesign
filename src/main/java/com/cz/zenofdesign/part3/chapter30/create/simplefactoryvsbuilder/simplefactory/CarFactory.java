package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: CarFactory
 * @date: 2019/7/15  13:11
 * @author: guohao
 * @Description:
 */
public interface CarFactory {

    public ICar createSuv();

    public ICar createVan();
}
