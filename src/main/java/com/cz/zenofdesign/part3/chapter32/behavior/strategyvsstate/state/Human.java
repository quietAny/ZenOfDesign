package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.state;

/**
 * @ClassName: Human
 * @date: 2019/7/15  16:40
 * @author: guohao
 * @Description:
 */
public class Human {

    private static final HumanState CHILD_STATE = new ChildState();
    private static final HumanState ADULT_STATE = new AdultState();
    private static final HumanState OLD_STATE = new OldState();

    private HumanState humanState;

    public void setHumanState(HumanState humanState) {
        this.humanState = humanState;
        this.humanState.setHuman(this);
    }

    public void work(){
        this.humanState.work();
    }
}
