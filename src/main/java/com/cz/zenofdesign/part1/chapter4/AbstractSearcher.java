package com.cz.zenofdesign.part1.chapter4;

/**
 * @ClassName: AbstractSearcher
 * @date: 2019/7/9  16:16
 * @author: guohao
 * @Description: 星探抽象类
 */
public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;

    public AbstractSearcher(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
