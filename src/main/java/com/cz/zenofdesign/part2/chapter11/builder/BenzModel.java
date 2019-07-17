package com.cz.zenofdesign.part2.chapter11.builder;

/**
 * @ClassName: BenzModel
 * @date: 2019/7/10  13:18
 * @author: guohao
 * @Description:
 */
public class BenzModel extends CarModel{
    @Override
    public void start() {
        System.out.println("奔驰车跑起来是这个样子的...");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车应该这样停车...");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的...");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰车的引擎是这个声音的...");
    }
}
