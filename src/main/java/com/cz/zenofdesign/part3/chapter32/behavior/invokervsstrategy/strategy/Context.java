package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.strategy;

/**
 * @ClassName: Context
 * @date: 2019/7/15  15:45
 * @author: guohao
 * @Description:
 */
public class Context {

    private Algorithm al;

    public Context(Algorithm al) {
        this.al = al;
    }

    public boolean compress(String source,String to){
      return this.al.compress(source,to);
    }

    public boolean unCompress(String source,String to){
        return this.al.unCompress(source,to);
    }
}
