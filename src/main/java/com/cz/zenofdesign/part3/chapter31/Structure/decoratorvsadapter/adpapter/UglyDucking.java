package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.adpapter;

/**
 * @ClassName: UglyDucking
 * @date: 2019/7/15  15:06
 * @author: guohao
 * @Description:
 */
public class UglyDucking extends WhiteSwan implements Duck  {
    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desAppearance() {
        super.desAppearance();
    }

    @Override
    public void desBehavior() {
        System.out.println("会游泳");
        super.fly();
    }
}
