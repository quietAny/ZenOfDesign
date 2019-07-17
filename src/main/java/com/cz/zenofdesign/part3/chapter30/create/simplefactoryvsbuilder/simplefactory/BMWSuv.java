package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: BMWSuv
 * @date: 2019/7/15  13:24
 * @author: guohao
 * @Description:
 */
public class BMWSuv extends AbsBMW {

    private static final String SEVENT_SEARIES = "G系列车型SUV";

    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
