package com.cz.zenofdesign.part2.chapter15.invoker;

/**
 * @ClassName: Client
 * @date: 2019/7/11  15:12
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("客户要求添加一个需求");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
