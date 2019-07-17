package com.cz.zenofdesign.part2.chapter7.singleton;

/**
 * @ClassName: SingletonE
 * @date: 2019/7/10  9:16
 * @author: guohao
 * @Description: 单例模式通用代码/饿汉式
 */
public class SingletonE {

    private static final SingletonE singleton = new SingletonE();

    /**
     * 1.私有化构造方法
     */
    private SingletonE(){

    }

    /**
     * 2.通过该方法得到实例的对象
     * @return
     */
    public static SingletonE getInstance(){
        return singleton;
    }

    /**
     * 3.其他方法尽量都是static
     */
    public static void doSomething(){

    }
}
