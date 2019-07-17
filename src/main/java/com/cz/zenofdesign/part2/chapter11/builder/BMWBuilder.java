package com.cz.zenofdesign.part2.chapter11.builder;

import java.util.ArrayList;

/**
 * @ClassName: BMWBuilder
 * @date: 2019/7/10  13:17
 * @author: guohao
 * @Description: 宝马车组装
 */
public class BMWBuilder extends CarBuilder{

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList sequence) {
        this.bmwModel.setSqeuence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
