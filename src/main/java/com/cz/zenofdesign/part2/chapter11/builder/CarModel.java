package com.cz.zenofdesign.part2.chapter11.builder;

import java.util.ArrayList;

/**
 * @ClassName: CarModel
 * @date: 2019/7/10  13:16
 * @author: guohao
 * @Description: 汽车模型抽象类
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();

    public void run(){
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionNanme = this.sequence.get(i);
            if(actionNanme.equalsIgnoreCase("start")){
                this.start();
            }else if(actionNanme.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionNanme.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionNanme.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }

    public void setSqeuence(ArrayList sqeuence){
        this.sequence = sqeuence;
    }
}
