package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.strategy;

/**
 * @ClassName: Context
 * @date: 2019/7/15  16:35
 * @author: guohao
 * @Description:
 */
public class Context {

    private WorkAlgorithm workAlgorithm;

    public Context(WorkAlgorithm workAlgorithm) {
        this.workAlgorithm = workAlgorithm;
    }

    public void work(){
        this.workAlgorithm.work();
    }
}
