package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.state;

/**
 * @ClassName: HumanState
 * @date: 2019/7/15  16:39
 * @author: guohao
 * @Description:
 */
public abstract class HumanState {

    protected Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public abstract void work();
}
