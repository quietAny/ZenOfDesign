package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.state;

/**
 * @ClassName: OldState
 * @date: 2019/7/15  16:45
 * @author: guohao
 * @Description:
 */
public class OldState extends HumanState {
    @Override
    public void work() {
        System.out.println("老年人的工作就是享受生活");
    }
}
