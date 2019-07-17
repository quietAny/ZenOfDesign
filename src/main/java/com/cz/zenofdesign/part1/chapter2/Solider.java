package com.cz.zenofdesign.part1.chapter2;

/**
 * @ClassName: Solider
 * @date: 2019/7/9  15:13
 * @author: guohao
 * @Description: 士兵类
 */
public class Solider {

    private AbstractGun abstractGun;

    public void setAbstractGun(AbstractGun abstractGun) {
        this.abstractGun = abstractGun;
    }

    /**
     * 开枪射击
     */
    public void killEnemy(){
        abstractGun.shoot();
    }

}
