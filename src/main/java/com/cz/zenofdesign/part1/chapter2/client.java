package com.cz.zenofdesign.part1.chapter2;

/**
 * @ClassName: client
 * @date: 2019/7/9  15:15
 * @author: guohao
 * @Description: 里氏变换原则
 */
public class client {

    public static void main(String[] args) {

        Solider solider = new Solider();
        solider.setAbstractGun(new HandGun());
        solider.killEnemy();

        solider.setAbstractGun(new Rifle());
        solider.killEnemy();

        solider.setAbstractGun(new MachineGun());
        solider.killEnemy();
    }
}
