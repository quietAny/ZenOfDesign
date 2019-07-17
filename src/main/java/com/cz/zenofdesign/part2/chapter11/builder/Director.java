package com.cz.zenofdesign.part2.chapter11.builder;

import java.util.ArrayList;

/**
 * @ClassName: Director
 * @date: 2019/7/10  14:02
 * @author: guohao
 * @Description: 指挥者
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel(){
            this.sequence.clear();
            this.sequence.add("start");
            this.sequence.add("stop");
            this.benzBuilder.setSequence(this.sequence);
            return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getABMWModel(){
        this.sequence.clear();

        this.sequence.add("start");

        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getBBMWModel(){
        this.sequence.clear();
        this.sequence.add("engineboom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
