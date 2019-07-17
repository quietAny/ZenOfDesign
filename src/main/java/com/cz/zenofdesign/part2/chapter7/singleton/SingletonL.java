package com.cz.zenofdesign.part2.chapter7.singleton;

/**
 * @ClassName: SingletonL
 * @date: 2019/7/10  9:24
 * @author: guohao
 * @Description: 单例模式通用代码/懒汉式/线程安全
 */
public class SingletonL {

    private static SingletonL singleton = null;

    private SingletonL(){

    }
    public static SingletonL getInstance(){
        if(singleton == null){
            synchronized (SingletonL.class){
                if(singleton == null){
                    singleton = new SingletonL();
                }
            }
        }

        return singleton;
    }
}
