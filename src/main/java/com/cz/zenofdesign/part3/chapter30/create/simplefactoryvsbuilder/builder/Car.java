package com.cz.zenofdesign.part3.chapter30.create.simplefactoryvsbuilder.builder;

/**
 * @ClassName: Car
 * @date: 2019/7/15  13:48
 * @author: guohao
 * @Description:
 */
public class Car implements ICar {

    private String wheel;
    private String engine;

    public Car(String wheel, String engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String getWheel() {
        return this.wheel;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
