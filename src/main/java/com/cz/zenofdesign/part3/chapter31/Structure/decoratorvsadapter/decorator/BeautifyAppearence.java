package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.decorator;

/**
 * @ClassName: BeautifyAppearence
 * @date: 2019/7/15  14:52
 * @author: guohao
 * @Description:
 */
public class BeautifyAppearence extends Decorator{

    public BeautifyAppearence(Swan swan) {
        super(swan);
    }

    @Override
    public void desAppearance() {
        System.out.println("外表是纯白色的，很惹人喜欢");
    }
}
