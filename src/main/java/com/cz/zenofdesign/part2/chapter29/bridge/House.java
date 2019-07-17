package com.cz.zenofdesign.part2.chapter29.bridge;

/**
 * @ClassName: House
 * @date: 2019/7/15  10:37
 * @author: guohao
 * @Description:
 */
public class House extends Product{
    @Override
    public void beProducted() {
        System.out.println("房子建造好了。。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("房子卖出去了。。。。");
    }
}
