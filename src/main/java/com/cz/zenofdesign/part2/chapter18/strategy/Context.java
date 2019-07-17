package com.cz.zenofdesign.part2.chapter18.strategy;

/**
 * @ClassName: Context
 * @date: 2019/7/11  17:10
 * @author: guohao
 * @Description:
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate(){
        this.iStrategy.operate();
    }
}
