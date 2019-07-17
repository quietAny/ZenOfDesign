package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.builder;

/**
 * @ClassName: CarBuilder
 * @date: 2019/7/15  13:52
 * @author: guohao
 * @Description: 抽象建造者
 */
public abstract class CarBuilder {
    //待建造的汽车
    private ICar car;
    //设计蓝图
    private Blueprint bp;

    public Car buildCar(){
        return new Car(buildWheel(),buildEngine());
    }

    /**
     * 接收蓝图
     * @param bp
     */
    public void receiveBlueprint(Blueprint bp){
        this.bp = bp;
    }

    /**
     * 查看蓝图
     * @return
     */
    protected Blueprint getBlueprint() {
        return bp;
    }

    //建造车轮
    protected abstract String buildWheel();

    //建造引擎
    protected abstract String buildEngine();
}
