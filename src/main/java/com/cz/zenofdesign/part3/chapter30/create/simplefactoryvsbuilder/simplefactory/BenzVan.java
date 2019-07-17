package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: BenzVan
 * @date: 2019/7/15  13:18
 * @author: guohao
 * @Description:
 */
public class BenzVan extends AbsBenz {

    private static final String SEVENT_SEARIES = "7系列车型商务车";

    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
