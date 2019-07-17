package com.cz.zenofdesign.part2.chapter18.strategy;

/**
 * @ClassName: BlockEnemy
 * @date: 2019/7/11  17:13
 * @author: guohao
 * @Description:
 */
public class BlockEnemy implements IStrategy{
    @Override
    public void operate() {
        System.out.println("孙夫人断后");
    }
}
