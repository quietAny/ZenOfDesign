package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: AbsBMW
 * @date: 2019/7/15  13:16
 * @author: guohao
 * @Description:
 */
public abstract class AbsBMW implements ICar {

    private final static String BMW_BAND = "宝马汽车";

    @Override
    public String getBand() {
        return BMW_BAND;
    }

    public abstract String getModel();
}
