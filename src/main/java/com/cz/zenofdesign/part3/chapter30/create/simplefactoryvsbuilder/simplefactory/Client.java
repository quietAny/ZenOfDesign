package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.simplefactory;

/**
 * @ClassName: Client
 * @date: 2019/7/15  13:29
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("按照要求生产一辆奔驰suv");
        System.out.println("A、找到奔驰车厂");
        CarFactory carFactory = new BenzFactory();
        System.out.println("B、开始生产奔驰SUV");
        ICar benzSuv = carFactory.createSuv();
        System.out.println("C、生产出的汽车如下：");
        System.out.println("汽车品牌："  + benzSuv.getBand());
        System.out.println("汽车型号：" + benzSuv.getModel());
    }
}
