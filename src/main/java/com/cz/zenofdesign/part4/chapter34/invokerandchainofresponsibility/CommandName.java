package com.cz.zenofdesign.part4.chapter34.invokerandchainofresponsibility;

import com.cz.zenofdesign.part2.chapter8.factorymethod.Product;

/**
 * @ClassName: CommandName
 * @date: 2019/7/16  14:22
 * @author: guohao
 * @Description:
 */
public abstract class CommandName {

    private CommandName nextOperator;

    public final String handleMessage(CommandVO vo){
        //处理结果
        String result = "";
        //判断是否是自己处理的参数
        if(vo.getParamList().size() == 0 || vo.getParamList().contains(this.getOperateParam())){
            result = this.echo(vo);
        }else{
            if (this.nextOperator != null){
                result = this.nextOperator.handleMessage(vo);
            }else {
                result = "无法执行命令！";
            }
        }

        return result;
    }

    /**
     * 设置剩余参数由谁来决定
     */
    public void setNext(CommandName commandName){
        this.nextOperator = commandName;
    }

    //每个处理者都有处理一个后缀参数
    protected abstract String getOperateParam();

    //每个处理者都必须实现的处理任务
    protected abstract String echo(CommandVO vo);
}
