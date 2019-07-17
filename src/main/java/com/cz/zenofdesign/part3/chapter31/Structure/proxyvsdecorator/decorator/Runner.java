package com.cz.zenofdesign.part3.chapter31.Structure.proxyvsdecorator.decorator;

/**
 * @ClassName: Runner
 * @date: 2019/7/15  14:36
 * @author: guohao
 * @Description:
 */
public class Runner implements IRunner {
    @Override
    public void run() {
        System.out.println("运动员跑步");
    }
}
