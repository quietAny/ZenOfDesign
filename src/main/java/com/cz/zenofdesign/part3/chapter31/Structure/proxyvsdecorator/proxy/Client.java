package com.cz.zenofdesign.part3.chapter31.Structure.proxyvsdecorator.proxy;

/**
 * @ClassName: Client
 * @date: 2019/7/15  14:29
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner agent = new RunnerAgent(runner);
        System.out.println("====客人找到代理要求运动员跑步====");
        agent.run();
    }
}
