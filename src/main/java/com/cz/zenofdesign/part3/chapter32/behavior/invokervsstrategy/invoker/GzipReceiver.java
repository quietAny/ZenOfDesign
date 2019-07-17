package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: GzipReceiver
 * @date: 2019/7/15  16:01
 * @author: guohao
 * @Description:
 */
public class GzipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + " GZIP压缩成功");
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println(source + "-->" + to + " GZIP解压成功");
        return false;
    }
}
