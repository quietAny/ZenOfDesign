package com.cz.zenofdesign.part3.chapter33.crossregion.facadevsmediator.mediator;

/**
 * @ClassName: AbsColleague
 * @date: 2019/7/16  10:45
 * @author: guohao
 * @Description: 抽象同事类
 */
public abstract class AbsColleague {

    protected AbsMadiator madiator;

    public AbsColleague(AbsMadiator madiator) {
        this.madiator = madiator;
    }
}
