package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.state;

/**
 * @ClassName: ChildState
 * @date: 2019/7/15  16:42
 * @author: guohao
 * @Description:
 */
public class ChildState extends HumanState {
    @Override
    public void work() {
        System.out.println("孩子的工作就是玩游戏");
    }
}
