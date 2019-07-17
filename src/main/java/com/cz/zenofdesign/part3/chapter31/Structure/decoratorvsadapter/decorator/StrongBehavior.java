package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.decorator;

/**
 * @ClassName: StrongBehavior
 * @date: 2019/7/15  14:55
 * @author: guohao
 * @Description:
 */
public class StrongBehavior extends Decorator {

    public StrongBehavior(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("会飞行了");
    }
}
