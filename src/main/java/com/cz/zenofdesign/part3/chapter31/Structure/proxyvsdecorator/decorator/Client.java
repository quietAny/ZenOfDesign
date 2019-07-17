package com.cz.zenofdesign.part3.chapter31.Structure.proxyvsdecorator.decorator;

/**
 * @ClassName: Client
 * @date: 2019/7/15  14:37
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
            IRunner runner = new Runner();
            IRunner runnerWtihJet = new RunnerWithJet(runner);
            runnerWtihJet.run();
    }
}
