package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.state;

/**
 * @ClassName: AdultState
 * @date: 2019/7/15  16:44
 * @author: guohao
 * @Description:
 */
public class AdultState extends HumanState {
    @Override
    public void work() {
        System.out.println("成年人的工作就是养活自己");
    }
}
