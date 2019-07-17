package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.builder;


/**
 * @ClassName: Client
 * @date: 2019/7/15  14:12
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("生产一辆奔驰SUV");
        ICar benzSuv = director.createBenzSuv();
        System.out.println(benzSuv);
        System.out.println("生产一辆宝马商务车");
        ICar bMWMVen = director.createBMWVan();
        System.out.println(bMWMVen);
        System.out.println("生产一辆混合车辆");
        ICar complexCar = director.createComplexCar();
        System.out.println(complexCar);
    }
}
