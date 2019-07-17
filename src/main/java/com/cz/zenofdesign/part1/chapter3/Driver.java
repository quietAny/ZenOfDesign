package com.cz.zenofdesign.part1.chapter3;

/**
 * @ClassName: Driver
 * @date: 2019/7/9  15:51
 * @author: guohao
 * @Description:
 */
public class Driver implements IDriver{

    private ICar car;

    public Driver(ICar car) {
        this.car = car;
    }

    @Override
    public void driver() {
        this.car.run();
    }
}
