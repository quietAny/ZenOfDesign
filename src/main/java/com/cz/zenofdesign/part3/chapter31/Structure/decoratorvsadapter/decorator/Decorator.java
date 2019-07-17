package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.decorator;

/**
 * @ClassName: Decorator
 * @date: 2019/7/15  14:50
 * @author: guohao
 * @Description:
 */
public class Decorator implements Swan {

    private Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        this.swan.fly();
    }

    @Override
    public void cry() {
        this.swan.cry();
    }

    @Override
    public void desAppearance() {
        this.swan.desAppearance();
    }
}
