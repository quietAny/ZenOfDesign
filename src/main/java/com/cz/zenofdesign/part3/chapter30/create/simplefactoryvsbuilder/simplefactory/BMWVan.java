package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: BMWVan
 * @date: 2019/7/15  13:24
 * @author: guohao
 * @Description:
 */
public class BMWVan extends AbsBMW {

    private static final String SEVENT_SEARIES = "R系列车型商务车";

    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
