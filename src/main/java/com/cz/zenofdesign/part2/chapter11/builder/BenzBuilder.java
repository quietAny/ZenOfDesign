package com.cz.zenofdesign.part2.chapter11.builder;

import java.util.ArrayList;

/**
 * @ClassName: BenzBuilder
 * @date: 2019/7/10  13:17
 * @author: guohao
 * @Description: 奔驰车组装
 */
public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList sequence) {
        this.benzModel.setSqeuence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
