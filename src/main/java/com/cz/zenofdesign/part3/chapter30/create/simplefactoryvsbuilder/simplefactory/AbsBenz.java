package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: AbsBenz
 * @date: 2019/7/15  13:15
 * @author: guohao
 * @Description:
 */
public abstract class AbsBenz implements ICar {

    private static final String BENZ_BAND = "奔驰汽车";
    @Override
    public String getBand() {
        return BENZ_BAND;
    }


    public abstract String getModel();
}
