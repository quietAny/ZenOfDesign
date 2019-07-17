package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.invoker;

/**
 * @ClassName: ZipReceiver
 * @date: 2019/7/15  16:01
 * @author: guohao
 * @Description:
 */
public class ZipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + " ZIP压缩成功");
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println(source + "-->" + to + " ZIP解压成功");
        return true;
    }
}
