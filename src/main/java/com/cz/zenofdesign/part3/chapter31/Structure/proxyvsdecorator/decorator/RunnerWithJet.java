package com.cz.zenofdesign.part3.chapter31.Structure.proxyvsdecorator.decorator;

/**
 * @ClassName: RunnerWithJet
 * @date: 2019/7/15  14:36
 * @author: guohao
 * @Description:
 */
public class RunnerWithJet implements IRunner {

    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        this.runner.run();
        fly();
    }

    public void fly(){
        System.out.println("飞一样的");
    }
}
