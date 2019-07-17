package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.builder;

/**
 * @ClassName: Director
 * @date: 2019/7/15  13:45
 * @author: guohao
 * @Description:
 */
public class Director  {

    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bMWBuilder = new BMWBuilder();

    public ICar createBenzSuv(){
        return CreateCar(benzBuilder,"benz的轮子","benz的引擎");
    }

    public ICar createBMWVan(){
        return CreateCar(bMWBuilder,"BMW的轮子","BMW的引擎");
    }

    public ICar createComplexCar(){
        return CreateCar(benzBuilder,"benz的轮子","BMW的引擎");
    }


    /**
     * 生产车辆
     * @param carBuilder
     * @param wheel
     * @param engine
     * @return
     */
    private ICar CreateCar(CarBuilder carBuilder, String wheel, String engine) {
        Blueprint bp = new Blueprint();
        bp.setWheel(wheel);
        bp.setEngine(engine);
        System.out.println("获得生产蓝图");
        carBuilder.receiveBlueprint(bp);
        return carBuilder.buildCar();
    }


}
