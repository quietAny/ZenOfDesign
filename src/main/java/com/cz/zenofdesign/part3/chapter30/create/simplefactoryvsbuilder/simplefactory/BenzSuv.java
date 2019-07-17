package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: BenzSuv
 * @date: 2019/7/15  13:17
 * @author: guohao
 * @Description:
 */
public class BenzSuv extends AbsBenz {

    private static final String SEVENT_SEARIES = "X系列车型SUV";
    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
