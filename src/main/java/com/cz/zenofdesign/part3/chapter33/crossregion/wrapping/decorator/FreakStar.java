package com.cz.zenofdesign.part3.chapter33.crossregion.wrapping.decorator;

/**
 * @ClassName: FreakStar
 * @date: 2019/7/16  13:39
 * @author: guohao
 * @Description:
 */
public class FreakStar implements IStar{
    @Override
    public void act() {
        System.out.println("演中：演技拙劣");
    }
}
