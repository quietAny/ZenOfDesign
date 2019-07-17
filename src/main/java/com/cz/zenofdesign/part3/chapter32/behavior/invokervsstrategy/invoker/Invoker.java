package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: Invoker
 * @date: 2019/7/15  16:13
 * @author: guohao
 * @Description:
 */
public class Invoker {

    private AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    public boolean excute(String source,String to){
        return this.cmd.execute(source,to);
    }
}
