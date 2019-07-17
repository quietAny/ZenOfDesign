package com.cz.zenofdesign.part2.chapter22.observer;

/**
 * @ClassName: ConcreteObserver
 * @date: 2019/7/12  11:13
 * @author: guohao
 * @Description:
 */
public class ConcreteObserver implements Observer{

    @Override
    public void update() {
        System.out.println("观察者接收到消息并处理！");
    }

}
