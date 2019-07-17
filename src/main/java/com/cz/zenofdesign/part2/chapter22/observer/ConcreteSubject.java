package com.cz.zenofdesign.part2.chapter22.observer;

/**
 * @ClassName: ConcreteSubject
 * @date: 2019/7/12  11:11
 * @author: guohao
 * @Description: 具体被观察者
 */
public class ConcreteSubject extends Subject {

    /**
     * 具体业务
     */
    public void doSomething(){
        System.out.println("被观察者处理具体的逻辑");
        super.notifyObservers();
    }


}
