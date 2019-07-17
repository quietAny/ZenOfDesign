package com.cz.zenofdesign.part2.chapter18.strategy;

/**
 * @ClassName: BackDoor
 * @date: 2019/7/11  17:11
 * @author: guohao
 * @Description:
 */
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找乔国老开后门");
    }
}
