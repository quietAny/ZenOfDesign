package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: GzipUnCompressCmd
 * @date: 2019/7/15  16:10
 * @author: guohao
 * @Description:
 */
public class GzipUnCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String resouce, String to) {
        return super.gZipReceiver.unCompress(resouce,to);
    }
}
