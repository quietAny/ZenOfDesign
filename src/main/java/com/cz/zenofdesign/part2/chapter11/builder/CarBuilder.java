package com.cz.zenofdesign.part2.chapter11.builder;

import java.util.ArrayList;

/**
 * @ClassName: CarBuilder
 * @date: 2019/7/10  13:15
 * @author: guohao
 * @Description: 汽车制造商抽象类
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList sequence);

    public abstract CarModel getCarModel();
}
