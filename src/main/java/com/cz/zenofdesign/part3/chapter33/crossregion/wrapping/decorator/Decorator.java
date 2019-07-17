package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.decorator;

/**
 * @ClassName: Decorator
 * @date: 2019/7/16  13:39
 * @author: guohao
 * @Description:
 */
public class Decorator implements IStar {

    private IStar iStar;

    public Decorator(IStar iStar) {
        this.iStar = iStar;
    }

    @Override
    public void act() {
        iStar.act();
    }
}
