package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: Client
 * @date: 2019/7/15  16:12
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        AbstractCmd abstractCmd = new GzipCompressCmd();

        Invoker invoker = new Invoker(abstractCmd);
        invoker.excute("c:/windows","d:/windows.zip");
    }
}
