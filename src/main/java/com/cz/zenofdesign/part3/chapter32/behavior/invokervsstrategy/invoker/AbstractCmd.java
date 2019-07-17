package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: AbstractCmd
 * @date: 2019/7/15  16:02
 * @author: guohao
 * @Description:
 */
public abstract class AbstractCmd {

    protected IReceiver zipReceiver = new ZipReceiver();
    protected IReceiver gZipReceiver = new GzipReceiver();

    public abstract boolean execute(String resouce,String to);
}
