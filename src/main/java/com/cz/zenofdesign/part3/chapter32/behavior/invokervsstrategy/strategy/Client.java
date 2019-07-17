package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.strategy;

/**
 * @ClassName: Client
 * @date: 2019/7/15  15:48
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        Context context;
        System.out.println("----执行算法----");
        context = new Context(new Zip());
        /*
          算法替换
          context = new Context(new Gzip());
         */
        context.compress("c:/windows","d:/windows.zip");
        context.unCompress("c:/windos.zip","d:/windows");
    }
}
