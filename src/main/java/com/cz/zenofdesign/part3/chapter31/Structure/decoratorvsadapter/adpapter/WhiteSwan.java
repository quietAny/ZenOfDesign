package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.adpapter;

/**
 * @ClassName: WhiteSwan
 * @date: 2019/7/15  15:07
 * @author: guohao
 * @Description:
 */
public class WhiteSwan implements Swan {
    @Override
    public void fly() {
        System.out.println("能够飞行");
    }

    @Override
    public void cry() {
        System.out.println("叫声是克噜-克噜");
    }

    @Override
    public void desAppearance() {
        System.out.println("外形是纯白的的，惹人喜爱");
    }
}
