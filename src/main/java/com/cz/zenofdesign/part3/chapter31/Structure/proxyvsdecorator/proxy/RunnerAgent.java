package com.cz.zenofdesign.part3.chapter31.Structure.proxyvsdecorator.proxy;

import java.util.Random;

/**
 * @ClassName: RunnerAgent
 * @date: 2019/7/15  14:28
 * @author: guohao
 * @Description:
 */
public class RunnerAgent implements IRunner {

    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println("代理人同意");
            this.runner.run();
        }else {
            System.out.println("代理人不同意");
        }
    }
}
