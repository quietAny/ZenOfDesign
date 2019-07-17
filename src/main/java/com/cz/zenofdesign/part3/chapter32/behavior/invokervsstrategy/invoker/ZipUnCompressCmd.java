package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: ZipUnCompressCmd
 * @date: 2019/7/15  16:08
 * @author: guohao
 * @Description:
 */
public class ZipUnCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String resouce, String to) {
        return super.zipReceiver.unCompress(resouce,to);
    }
}
