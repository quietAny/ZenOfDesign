package com.cz.zenofdesign.part2.chapter29.bridge;

/**
 * @ClassName: IPod
 * @date: 2019/7/15  10:38
 * @author: guohao
 * @Description:
 */
public class IPod extends Product{
    @Override
    public void beProducted() {
        System.out.println("IPod生产好了。。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("IPod卖出去了。。。。");
    }
}
