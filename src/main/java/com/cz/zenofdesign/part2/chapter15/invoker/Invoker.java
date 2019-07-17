package com.cz.zenofdesign.part2.chapter15.invoker;

/**
 * @ClassName: Invoker
 * @date: 2019/7/11  15:02
 * @author: guohao
 * @Description: 负责人
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }

}
