package com.cz.zenofdesign.part2.chapter18.strategy;

/**
 * @ClassName: Client
 * @date: 2019/7/11  17:14
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Context context;
        System.out.println("---刚刚到吴国拆开第一个---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("---刘备乐不思蜀了，打开第二个---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("---孙权的小兵追过来了，打开打三个---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
