package com.cz.zenofdesign.part2.chapter11.builder;

/**
 * @ClassName: BMWModel
 * @date: 2019/7/10  13:18
 * @author: guohao
 * @Description: 宝马车模型
 */
public class BMWModel extends CarModel{
    @Override
    public void start() {
        System.out.println(" 宝马车跑起来是这个样子的...");
    }

    @Override
    public void stop() {
        System.out.println(" 宝马车应该这样停车...");
    }

    @Override
    public void alarm() {
        System.out.println(" 宝马车的喇叭声音是这个样子的...");
    }

    @Override
    public void engineBoom() {
        System.out.println("宝马车的引擎是这个声音的...");
    }
}
