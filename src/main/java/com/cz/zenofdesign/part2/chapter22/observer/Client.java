package com.cz.zenofdesign.part2.chapter22.observer;

/**
 * @ClassName: Client
 * @date: 2019/7/12  11:14
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
