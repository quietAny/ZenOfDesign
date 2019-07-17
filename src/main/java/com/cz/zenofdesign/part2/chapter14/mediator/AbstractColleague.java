package com.cz.zenofdesign.part2.chapter14.mediator;

/**
 * @ClassName: AbstractColleague
 * @date: 2019/7/11  14:18
 * @author: guohao
 * @Description: 抽象同事类
 */
public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
