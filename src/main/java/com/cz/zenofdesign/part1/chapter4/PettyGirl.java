package com.cz.zenofdesign.part1.chapter4;

/**
 * @ClassName: PettyGirl
 * @date: 2019/7/9  16:30
 * @author: guohao
 * @Description: 美女
 */
public class PettyGirl implements IPettyGirl{

    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "脸蛋很漂亮！");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "身材很好");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "气质非常棒");
    }
}
