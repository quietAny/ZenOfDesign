package com.cz.zenofdesign.part4.chapter34.invokerandchainofresponsibility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @ClassName: CommandVO
 * @date: 2019/7/16  14:23
 * @author: guohao
 * @Description:
 */
public class CommandVO {

    //定义参数名与参数的分隔符号，一般是空格
    public final static String DIVIDE_FLAG = " ";
    //定义参数前的符号，Unix一般是-，如ls -la
    public final static String PREFIX = "-";
    //命令名，如ls,du
    private String commandName ="";
    //参数列表
    private ArrayList<String> paramList = new ArrayList<String>();
    //操作数列表
    private ArrayList<String> dataList = new ArrayList<String>();
    //通过构造函数传递进来命令
    public CommandVO(String commandStr) {
        if(commandStr != null && commandStr.length() != 0){
            String[] complexStr = commandStr.split(CommandVO.DIVIDE_FLAG);
            this.commandName = complexStr[0];
            for (int i = 0; i < complexStr.length; i++) {
                String str = complexStr[i];
                //包含前缀符号，认为是参数
                if(str.indexOf(CommandVO.PREFIX) == 0){
                    this.paramList.add(str.replace(CommandVO.PREFIX,"").trim());
                }else {
                    this.dataList.add(str.trim());
                }
            }
        }else {
            System.out.println("命令解析失败，必须传递一个命令才能执行！");
        }
    }

    /**
     * 得到命令
     * @return
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * 得到参数
     * @return
     */
    public ArrayList<String> getParamList() {
        if (this.paramList.size() == 0){
            this.paramList.add("");
        }
        return new ArrayList<>(new HashSet<>(this.paramList));
    }

    /**
     * 得到操作数
     * @return
     */
    public ArrayList<String> getDataList() {
        return this.dataList;
    }

}
