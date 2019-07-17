package com.cz.zenofdesign.part4.chapter34.invokerandchainofresponsibility;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Command
 * @date: 2019/7/16  15:16
 * @author: guohao
 * @Description: 抽象命令
 */
public abstract class Command {

    public abstract String execute(CommandVO vo);
    //建立链表
    protected final List<? extends CommandName> buildChain(Class<? extends AbstractLS> abstractClass){
        //取出所有命令下的子类
        List<Class> classes = ClassUtils.getSonClass(abstractClass);
        //存放命令的实例，并建立链连接
        List<CommandName> commandNameList = new ArrayList<CommandName>();
        for(Class c : classes){
            CommandName commandName = null;
            try{
             //   commandName = (CommandName)Class.forName(c.getName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return commandNameList;
    }
}
