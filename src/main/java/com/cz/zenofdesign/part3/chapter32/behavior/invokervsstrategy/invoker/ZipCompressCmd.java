package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: ZipCompressCmd
 * @date: 2019/7/15  16:05
 * @author: guohao
 * @Description:
 */
public class ZipCompressCmd extends AbstractCmd{
    @Override
    public boolean execute(String resouce, String to) {
        return super.zipReceiver.compress(resouce,to);
    }
}
