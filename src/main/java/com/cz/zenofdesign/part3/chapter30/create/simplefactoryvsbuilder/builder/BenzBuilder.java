package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.builder;

/**
 * @ClassName: BenzBuilder
 * @date: 2019/7/15  14:04
 * @author: guohao
 * @Description:
 */
public class BenzBuilder extends CarBuilder{

    @Override
    protected String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
