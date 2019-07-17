package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.builder;

/**
 * @ClassName: BMWBuilder
 * @date: 2019/7/15  14:03
 * @author: guohao
 * @Description:
 */
public class BMWBuilder extends CarBuilder{
    @Override
    protected String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
