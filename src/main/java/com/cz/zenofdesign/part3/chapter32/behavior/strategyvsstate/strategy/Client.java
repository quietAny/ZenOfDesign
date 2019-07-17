package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.strategy;

/**
 * @ClassName: Client
 * @date: 2019/7/15  16:36
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        WorkAlgorithm workAlgorithm = new ChildWork();
        Context context = new Context(workAlgorithm);
        context.work();
    }
}
