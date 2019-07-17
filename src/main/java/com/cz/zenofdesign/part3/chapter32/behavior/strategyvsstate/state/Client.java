package com.cz.zenofdesign.part3.chapter32.behavior.strategyvsstate.state;

/**
 * @ClassName: Client
 * @date: 2019/7/15  16:47
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Human human = new Human();
        human.setHumanState(new ChildState());
        System.out.println("儿童的工作----");
        human.work();

    }
}
