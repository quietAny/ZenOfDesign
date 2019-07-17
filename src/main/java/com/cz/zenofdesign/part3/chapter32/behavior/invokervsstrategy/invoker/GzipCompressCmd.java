package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: GzipCompressCmd
 * @date: 2019/7/15  16:09
 * @author: guohao
 * @Description:
 */
public class GzipCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String resouce, String to) {
        return super.gZipReceiver.compress(resouce,to);
    }
}
