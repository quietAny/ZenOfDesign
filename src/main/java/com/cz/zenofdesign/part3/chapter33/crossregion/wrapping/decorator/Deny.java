package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.decorator;

/**
 * @ClassName: Deny
 * @date: 2019/7/16  13:42
 * @author: guohao
 * @Description:
 */
public class Deny extends Decorator{

    public Deny(IStar iStar) {
        super(iStar);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("演后：百般抵赖，死不承认");
    }
}
