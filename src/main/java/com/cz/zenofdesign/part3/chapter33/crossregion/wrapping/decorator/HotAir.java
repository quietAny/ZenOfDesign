package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.decorator;

/**
 * @ClassName: HotAir
 * @date: 2019/7/16  13:42
 * @author: guohao
 * @Description:
 */
public class HotAir extends Decorator {


    public HotAir(IStar iStar) {
        super(iStar);
    }

    @Override
    public void act() {
        System.out.println("演前：夸夸其谈，没有自己不能演的角色");
        super.act();
    }
}
