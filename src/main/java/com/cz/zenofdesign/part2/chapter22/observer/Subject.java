package com.cz.zenofdesign.part2.chapter22.observer;

import java.util.Vector;

/**
 * @ClassName: Subject
 * @date: 2019/7/12  11:00
 * @author: guohao
 * @Description: 被观察者抽象
 */
public abstract class Subject {

    //定义一个观察者数组
    private Vector<Observer> observerVector  = new Vector<Observer>();

    /**
     * 添加一个观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        this.observerVector.add(observer);
    }

    /**
     * 删除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer){
        this.observerVector.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers(){
        for (Observer o : this.observerVector) {
            o.update();
        }
    }

}
