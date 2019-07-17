package com.cz.zenofdesign.part3.chapter32.behavior.invokervsstrategy.strategy;

/**
 * @ClassName: Gzip
 * @date: 2019/7/15  15:42
 * @author: guohao
 * @Description:
 */
public class Gzip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + " GZIP压缩成功");
        return true;
    }

    @Override
    public boolean unCompress(String source, String to) {
        System.out.println(source + "-->" + to + " GZIP解压成功");
        return true;
    }
}
