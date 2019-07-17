package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.decorator;

/**
 * @ClassName: Client
 * @date: 2019/7/15  14:56
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("----很久以前有个丑小鸭----");
        Swan uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.fly();
        uglyDuckling.desAppearance();
        System.out.println("----丑小鸭终于发现自己是白天鹅----");
        uglyDuckling = new StrongBehavior(uglyDuckling);
        uglyDuckling = new BeautifyAppearence(uglyDuckling);
        uglyDuckling.cry();
        uglyDuckling.fly();
        uglyDuckling.desAppearance();
    }
}
