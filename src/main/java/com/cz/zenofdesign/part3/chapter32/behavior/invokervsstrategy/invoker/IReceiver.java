package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: IReceiver
 * @date: 2019/7/15  16:01
 * @author: guohao
 * @Description:
 */
public interface IReceiver {

    public boolean compress(String source,String to);

    public boolean unCompress(String source,String to);
}
