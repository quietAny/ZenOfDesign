package com.cz.zenofdesign.part3.chapter31.Structure.decoratorvsadapter.adpapter;

/**
 * @ClassName: Client
 * @date: 2019/7/15  15:11
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("----鸭子妈妈有五个孩子，其中四个长这样----");
        Duck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();
        System.out.println("----有个独特的小鸭子长这样----");
        Duck uglyDuckling = new UglyDucking();
        uglyDuckling.cry();
        uglyDuckling.desBehavior();
        uglyDuckling.desAppearance();
    }
}
